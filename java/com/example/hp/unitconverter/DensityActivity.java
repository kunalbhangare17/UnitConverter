package com.example.hp.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DensityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button calculate;
        final EditText dens,mas,vol;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_density);

        calculate=(Button)findViewById(R.id.button);
        dens=(EditText)findViewById(R.id.Distance);
        mas=(EditText)findViewById(R.id.Speed);
        vol=(EditText)findViewById(R.id.Time);

        calculate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if((dens.getText().toString()== null || dens.getText().toString().isEmpty()) && (mas.getText().toString()== null || mas.getText().toString().isEmpty())){
                    Toast.makeText(DensityActivity.this, "Please enter atleast 2 parameters!", Toast.LENGTH_LONG).show();
                }
                else if((dens.getText().toString()== null || dens.getText().toString().isEmpty()) && (vol.getText().toString()== null || vol.getText().toString().isEmpty())){
                    Toast.makeText(DensityActivity.this, "Please enter atleast 2 parameters!", Toast.LENGTH_LONG).show();
                }
                else if((vol.getText().toString()== null || vol.getText().toString().isEmpty()) && (mas.getText().toString()== null || mas.getText().toString().isEmpty())){
                    Toast.makeText(DensityActivity.this, "Please enter atleast 2 parameters!", Toast.LENGTH_LONG).show();
                }
                else if(dens.getText().toString()== null || dens.getText().toString().isEmpty()){
                    //to find dens
                    float vol1,mass1,dens1;
                    vol1=Float.valueOf(vol.getText().toString());
                    mass1=Float.valueOf(mas.getText().toString());
                    dens1=mass1/vol1;
                    dens.setText(String.valueOf(dens1));

                }
                else if(mas.getText().toString()== null || mas.getText().toString().isEmpty()){
                    //to find mass
                    float vol2,mass2,dens2;
                    vol2=Float.valueOf(vol.getText().toString());
                    dens2=Float.valueOf(dens.getText().toString());
                    mass2=dens2*vol2;
                    mas.setText(String.valueOf(mass2));
                }
                else if(vol.getText().toString()== null || vol.getText().toString().isEmpty()){
                    //to find vol
                    float vol3,mass3,dens3;
                    mass3=Float.valueOf(mas.getText().toString());
                    dens3=Float.valueOf(dens.getText().toString());
                    vol3=mass3/dens3;
                    vol.setText(String.valueOf(vol3));
                }
            }
        });

    }
}
