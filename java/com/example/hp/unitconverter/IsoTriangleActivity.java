package com.example.hp.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class IsoTriangleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText number1;
        final EditText number2;
        final TextView peri,area;
        final Button calculate;

        final double[] a = new double[1];
        final double[] c = new double[1];
        final double[] ansarea = new double[1];
        final double[] ansperi = new double[1];


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iso_triangle);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        area = (TextView)findViewById(R.id.area);
        peri = (TextView)findViewById(R.id.peri);

        calculate = (Button)findViewById(R.id.calculate);
        calculate.setEnabled(false);

        number1.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = number1.getText().toString();
                String s2 = number2.getText().toString();


                if((s1.length()>0) && (s2.length()>0))
                {
                    calculate.setEnabled(true);
                }else{
                    calculate.setEnabled(false);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub

            }
        });
        number2.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = number1.getText().toString();
                String s2 = number2.getText().toString();


                if((s1.length()>0) && (s2.length()>0))
                {
                    calculate.setEnabled(true);
                }else{
                    calculate.setEnabled(false);
                }

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                a[0] = Double.parseDouble(number1.getText().toString());
                c[0] = Double.parseDouble(number2.getText().toString());

                ansperi[0] = 2* a[0] + c[0];
                peri.setText(String.valueOf(ansperi[0]));

                ansarea[0] = c[0] /2 * sqrt((a[0] * a[0]) - (c[0] * c[0]) /4);
                area.setText(String.valueOf(ansarea[0]));

            }

        });

    }
}
