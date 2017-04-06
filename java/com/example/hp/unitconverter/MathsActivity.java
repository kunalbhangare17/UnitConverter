package com.example.hp.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MathsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
    }

    public void circle(View view) {
        Intent intent = new Intent(this, CircleActivity.class);
        startActivity(intent);
    }

    public void cylinder(View view) {
        Intent intent = new Intent(this, CylinderActivity.class);
        startActivity(intent);
    }

    public void sphere(View view) {
        Intent intent = new Intent(this, SphereActivity.class);
        startActivity(intent);
    }

    public void square(View view) {
        Intent intent = new Intent(this, SquareActivity.class);
        startActivity(intent);
    }

    public void rectangle(View view) {
        Intent intent = new Intent(this, RectangeActivity.class);
        startActivity(intent);
    }

    public void triangle(View view) {
        Intent intent = new Intent(this, RectangeActivity.class);
        startActivity(intent);
    }

    public void equitriangle(View view) {
        Intent intent = new Intent(this, RectangeActivity.class);
        startActivity(intent);
    }

    public void isotriangle(View view) {
        Intent intent = new Intent(this, RectangeActivity.class);
        startActivity(intent);
    }

    public void cube(View view) {
        Intent intent = new Intent(this, RectangeActivity.class);
        startActivity(intent);
    }

    public void pythagorous(View view) {
        Intent intent = new Intent(this, RectangeActivity.class);
        startActivity(intent);
    }
}
