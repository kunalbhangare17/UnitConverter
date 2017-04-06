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

public class RectangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText number1,number2;
        final TextView area;
        final TextView peri;
        final TextView dia;
        final TextView rat;
        final Button calculate;

        final double[] len = new double[1];
        final double[] bre = new double[1];
        final double[] ansarea = new double[1];
        final double[] ansperi = new double[1];
        final double[] ansdia = new double[1];
        final double[] ansrat = new double[1];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectange);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        area = (TextView)findViewById(R.id.area);
        peri = (TextView)findViewById(R.id.peri);
        dia = (TextView)findViewById(R.id.dia);
        rat = (TextView)findViewById(R.id.rat);

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

             /*   if(s1.equals("") && s2.equals("")){
                    calculate.setEnabled(false);
                }
                else if(!s1.equals("") && s2.equals("")){
                    calculate.setEnabled(false);
                }
                else
                if(!s2.equals("") && s1.equals("")){
                    calculate.setEnabled(false);
                }
                else {
                    calculate.setEnabled(true);
                }*/

            }

            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
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

               /* if(s1.equals("") && s2.equals("")){
                    calculate.setEnabled(false);
                }
                else if(!s1.equals("")&&s2.equals("")){
                    calculate.setEnabled(false);
                }
                else if(!s2.equals("")&&s1.equals("")){
                    calculate.setEnabled(false);
                }
                else {
                    calculate.setEnabled(true);
                }*/

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
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

                len[0] = Double.parseDouble(number1.getText().toString());
                bre[0] = Double.parseDouble(number2.getText().toString());

                ansarea[0] = len[0] * bre[0];
                area.setText(String.valueOf(ansarea[0]));

                ansperi[0] = (2* len[0]) + (2* bre[0]);
                peri.setText(String.valueOf(ansperi[0]));

                ansdia[0] = sqrt((len[0] * len[0]) + (bre[0] * bre[0]));
                dia.setText(String.valueOf(ansdia[0]));

                ansrat[0] = len[0] / bre[0];
                rat.setText(String.valueOf(ansrat[0]));
            }

        });

    }
}
