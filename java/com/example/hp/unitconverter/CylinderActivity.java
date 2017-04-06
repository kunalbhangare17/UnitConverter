package com.example.hp.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CylinderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final EditText number1,number2;
        final TextView peri,barea,lsurface,tarea,vol;
        final Button calculate;

        final double[] radius = new double[1];
        final double[] height = new double[1];
        final double[] ansperi = new double[1];
        final double[] ansbarea = new double[1];
        final double[] anslsurface = new double[1];
        final double[] anstarea = new double[1];
        final double[] ansvol = new double[1];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        peri = (TextView)findViewById(R.id.peri);
        barea = (TextView)findViewById(R.id.barea);
        lsurface = (TextView)findViewById(R.id.lsurface);
        tarea = (TextView)findViewById(R.id.tarea);
        vol = (TextView)findViewById(R.id.vol);

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

                radius[0] = Double.parseDouble(number1.getText().toString());
                height[0] = Double.parseDouble(number2.getText().toString());

                ansperi[0] = radius[0] * 2 * 3.14159;
                peri.setText(String.valueOf(ansperi[0]));

                ansbarea[0] = radius[0] * radius[0] * 3.14159;
                barea.setText(String.valueOf(ansbarea[0]));

                anslsurface[0] = height[0] * ansperi[0];
                lsurface.setText(String.valueOf(anslsurface[0]));

                anstarea[0] = 2 * ansbarea[0] + anslsurface[0];
                tarea.setText(String.valueOf(anstarea[0]));

                ansvol[0] = height[0] * ansbarea[0];
                vol.setText(String.valueOf(ansvol[0]));
            }

        });

    }
}
