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

public class EquiTriangleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText num;
        final TextView hei,peri,area;
        final Button calculate;

        final double[] a = new double[1];
        final double[] ansarea = new double[1];
        final double[] ansperi = new double[1];
        final double[] anshei = new double[1];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equi_triangle);

        num = (EditText)findViewById(R.id.num);
        hei = (TextView)findViewById(R.id.hei);
        area = (TextView)findViewById(R.id.area);
        peri = (TextView)findViewById(R.id.peri);

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

                a[0] = Double.parseDouble(num.getText().toString());

                anshei[0] = a[0] * (sqrt(3)/2);
                hei.setText(String.valueOf(anshei[0]));

                ansperi[0] = 3* a[0];
                peri.setText(String.valueOf(ansperi[0]));

                ansarea[0] = a[0] * a[0] * sqrt(3)/4;
                area.setText(String.valueOf(ansarea[0]));
            }

        });


    }
}
