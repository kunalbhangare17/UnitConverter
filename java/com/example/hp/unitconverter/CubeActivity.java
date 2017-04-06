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

public class CubeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText num;
        final TextView lsurface,tarea,vol,sidedia,spacedia;
        final Button calculate;

        final double[] sidelen = new double[1];
        final double[] anslsurface = new double[1];
        final double[] anstarea = new double[1];
        final double[] ansvol = new double[1];
        final double[] anssidedia = new double[1];
        final double[] ansspacedia = new double[1];


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        num = (EditText)findViewById(R.id.num);
        lsurface = (TextView)findViewById(R.id.lsurface);
        tarea = (TextView)findViewById(R.id.tarea);
        vol = (TextView)findViewById(R.id.vol);
        sidedia = (TextView)findViewById(R.id.sidedia);
        spacedia = (TextView)findViewById(R.id.spacedia);

        calculate = (Button)findViewById(R.id.calculate);
        calculate.setEnabled(false);

        num.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = num.getText().toString();

                if(s1.length()>0 )
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

                sidelen[0] = Double.parseDouble(num.getText().toString());

                anslsurface[0] = sidelen[0] * sidelen[0];
                lsurface.setText(String.valueOf(anslsurface[0]));

                anstarea[0] = 6 * anslsurface[0];
                tarea.setText(String.valueOf(anstarea[0]));

                ansvol[0] = sidelen[0] * sidelen[0] * sidelen[0];
                vol.setText(String.valueOf(ansvol[0]));

                anssidedia[0] = sidelen[0] * sqrt(2);
                sidedia.setText(String.valueOf(anssidedia[0]));

                ansspacedia[0] = sidelen[0] * sqrt(3);
                spacedia.setText(String.valueOf(ansspacedia[0]));
            }

        });

    }
}
