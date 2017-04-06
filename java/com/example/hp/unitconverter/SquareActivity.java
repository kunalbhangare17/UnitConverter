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

public class SquareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText num;
        final TextView area,peri,dia;
        final Button calculate;

        final double[] s = new double[1];
        final double[] ansarea = new double[1];
        final double[] ansperi = new double[1];
        final double[] ansdia = new double[1];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        num = (EditText)findViewById(R.id.num);
        area = (TextView)findViewById(R.id.area);
        peri = (TextView)findViewById(R.id.peri);
        dia = (TextView)findViewById(R.id.dia);

        calculate = (Button)findViewById(R.id.calculate);
        calculate.setEnabled(false);

        num.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = num.getText().toString();

                if(s1.length()>0)
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


        calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s[0] = Double.parseDouble(num.getText().toString());

                ansarea[0] = s[0] * s[0];
                area.setText(String.valueOf(ansarea[0]));

                ansperi[0] = 4 * s[0];
                peri.setText(String.valueOf(ansperi[0]));

                ansdia[0] = sqrt(2 * s[0] * s[0]);
                dia.setText(String.valueOf(ansdia[0]));

            }

        });

    }
}
