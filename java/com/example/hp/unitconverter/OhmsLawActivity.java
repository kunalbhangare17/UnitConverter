package com.example.hp.unitconverter;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.view.View.*;

public class OhmsLawActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button calculate;
        final EditText volt,current,resistance,power;



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohms_law);

        calculate=(Button)findViewById(R.id.button);
        volt=(EditText)findViewById(R.id.Density);
        current=(EditText)findViewById(R.id.Speed);
        resistance=(EditText)findViewById(R.id.Time);
        power=(EditText)findViewById(R.id.Power);

        calculate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(current.getText().toString()== null || current.getText().toString().isEmpty()){
                    //to find current
                    float cur,vol,re;
                    re=Float.valueOf(resistance.getText().toString());
                    vol=Float.valueOf(volt.getText().toString());
                    cur=vol/re;
                    current.setText(String.valueOf(cur));
                }
                else if(volt.getText().toString()== null || volt.getText().toString().isEmpty()){
                    //to find voltage
                    float cur1,vol1,re1;
                    re1=Float.valueOf(resistance.getText().toString());
                    cur1=Float.valueOf(current.getText().toString());
                    vol1=cur1*re1;
                    volt.setText(String.valueOf(vol1));
                }
                else if(resistance.getText().toString()== null || resistance.getText().toString().isEmpty()){
                    //to find resistance
                    float cur2,vol2,re2;
                    vol2=Float.valueOf(volt.getText().toString());
                    cur2=Float.valueOf(current.getText().toString());
                    re2=vol2/cur2;
                    resistance.setText(String.valueOf(re2));
                }
                float temp=Float.valueOf(volt.getText().toString());
                float temp2=Float.valueOf(current.getText().toString());
                power.setText(String.valueOf(temp*temp2));
            }
        });

    }
}
