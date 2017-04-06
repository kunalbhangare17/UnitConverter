package com.example.hp.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CircleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        final EditText num;
        final TextView area,circum;
        final Button calculate;

        final double[] r = new double[1];
        final double[] ansarea = new double[1];
        final double[] anscircum = new double[1];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        num = (EditText)findViewById(R.id.num);
        area = (TextView)findViewById(R.id.area);
        circum = (TextView)findViewById(R.id.circum);

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

                r[0] = Double.parseDouble(num.getText().toString());

                ansarea[0] = r[0] * r[0] * 3.14159;
                area.setText(String.valueOf(ansarea[0]));

                anscircum[0] = 2 * r[0] * 3.14159;
                circum.setText(String.valueOf(anscircum[0]));

            }

        });

    }
}
