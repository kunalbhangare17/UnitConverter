package com.example.hp.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UnitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);
    }

    public void accelerationOpen(View view) {
        Intent intent = new Intent(this, AccelerationActivity.class);
        startActivity(intent);
    }

    public void areaOpen(View view) {
        Intent intent = new Intent(this, AreaActivity.class);
        startActivity(intent);
    }

    public void lengthOpen(View view) {
        Intent intent = new Intent(this, LengthActivity.class);
        startActivity(intent);
    }

    public void forceOpen(View view) {
        Intent intent = new Intent(this, ForceActitvity.class);
        startActivity(intent);
    }

    public void timeOpen(View view) {
        Intent intent = new Intent(this, TimeActivity.class);
        startActivity(intent);
    }

    public void temperatureOpen(View view) {
        Intent intent = new Intent(this, TemperatureActivity.class);
        startActivity(intent);
    }

    public void volumeOpen(View view) {
        Intent intent = new Intent(this, VolumeActivity.class);
        startActivity(intent);
    }
}
