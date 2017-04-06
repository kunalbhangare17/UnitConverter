package com.example.hp.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EngineeringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);
    }

    public void ohmsLawOpen(View view) {
        Intent intent = new Intent(this, OhmsLawActivity.class);
        startActivity(intent);
    }


    public void densityOpen(View view) {
        Intent intent = new Intent(this, DensityActivity.class);
        startActivity(intent);
    }

    public void speedDistaceOpen(View view) {
        Intent intent = new Intent(this, SqeedDistanceActivity.class);
        startActivity(intent);
    }

    public void percentage(View view) {
        Intent intent = new Intent(this, PercentageActivity.class);
        startActivity(intent);
    }

    public void proportion(View view) {
        Intent intent = new Intent(this, ProportionActivity.class);
        startActivity(intent);
    }
}
