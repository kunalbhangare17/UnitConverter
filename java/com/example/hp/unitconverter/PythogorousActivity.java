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

public class PythogorousActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText number1,number2;
        final TextView hypo;
        final Button calculate;

        final double[] adj = new double[1];
        final double[] oppo = new double[1];
        final double[] anshypo = new double[1];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pythogorous);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        hypo = (TextView)findViewById(R.id.hypo);

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

                adj[0] = Double.parseDouble(number1.getText().toString());
                oppo[0] = Double.parseDouble(number2.getText().toString());

                anshypo[0] = sqrt (adj[0] * adj[0] + oppo[0] * oppo[0]);
                hypo.setText(String.valueOf(anshypo[0]));

            }

        });

    }
}
