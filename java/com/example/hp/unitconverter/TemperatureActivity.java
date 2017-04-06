package com.example.hp.unitconverter;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TemperatureActivity extends AppCompatActivity {

    EditText celsius,fahrenheit,kelvin;
    TextView fahrenheitInCelsius,kelvinInCelsius,celsiusInFahrenheit,kelvinInFahrenheit,celsiusInKelvin,fahrenheitInKelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        celsius = (EditText) findViewById(R.id.celsius_text_box);
        fahrenheit = (EditText) findViewById(R.id.F_text_box);
        kelvin = (EditText) findViewById(R.id.kelvin_text_box);
        fahrenheitInCelsius = (TextView) findViewById(R.id.fInC);
        kelvinInCelsius = (TextView) findViewById(R.id.kelvinInC);
        celsiusInFahrenheit = (TextView) findViewById(R.id.cInF);
        kelvinInFahrenheit = (TextView) findViewById(R.id.kelvinInF);
        celsiusInKelvin = (TextView) findViewById(R.id.cInKelvin);
        fahrenheitInKelvin = (TextView) findViewById(R.id.fInKelvin);

        celsius.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (celsius.hasFocus() == true){

                    celsius.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                celsius.setText("0");
                                fahrenheitInCelsius.setText("F° :");
                                kelvinInCelsius.setText("Kelvin:");
                            }
                            return true;
                        }
                    });

                    celsius.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @RequiresApi(api = Build.VERSION_CODES.N)
                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {

                            celsiusInKelvin.setText("C°:");
                            fahrenheitInKelvin.setText("F°:");
                            celsiusInFahrenheit.setText("C°:");
                            kelvinInFahrenheit.setText("Kelvin:");
                            fahrenheitInCelsius.setBackgroundColor(Color.rgb(93, 173, 226));
                            fahrenheitInCelsius.setTextColor(Color.WHITE);
                            kelvinInCelsius.setBackgroundColor(Color.rgb(93, 173, 226));
                            kelvinInCelsius.setTextColor(Color.WHITE);
                            int ms = Integer.parseInt(celsius.getText().toString());
                            double fs = ms*33.8;
                            fahrenheitInCelsius.setText(String.valueOf("F°:\n"+ fs));
                            double gs = ms*274.15;
                            kelvinInCelsius.setText(String.valueOf("Kelvin:\n" + gs));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        fahrenheit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (fahrenheit.hasFocus() == true){

                    fahrenheit.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                fahrenheit.setText("0");
                                celsiusInFahrenheit.setText("C°:");
                                kelvinInFahrenheit.setText("Kelvin:");

                            }
                            return true;
                        }
                    });

                    fahrenheit.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {

                            celsiusInKelvin.setText("C°");
                            fahrenheitInKelvin.setText("F°:");
                            fahrenheitInCelsius.setText("F°:");
                            kelvinInCelsius.setText("Kelvin:");
                            celsiusInFahrenheit.setBackgroundColor(Color.rgb(93, 173, 226));
                            celsiusInFahrenheit.setTextColor(Color.WHITE);
                            kelvinInFahrenheit.setBackgroundColor(Color.rgb(93, 173, 226));
                            kelvinInFahrenheit.setTextColor(Color.WHITE);
                            int fs = Integer.parseInt(fahrenheit.getText().toString());
                            double ms = fs*(-17.22222);
                            celsiusInFahrenheit.setText(String.valueOf("C°:\n"+ ms));
                            double gs = fs*255.92778;
                            kelvinInFahrenheit.setText(String.valueOf("Kelvin:\n" + gs));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        kelvin.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (kelvin.hasFocus() == true){

                    kelvin.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                kelvin.setText("0");
                                celsiusInKelvin.setText("C°");
                                fahrenheitInKelvin.setText("F°:");

                            }
                            return true;
                        }
                    });

                    kelvin.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {

                            fahrenheitInCelsius.setText("F°:");
                            kelvinInCelsius.setText("Kelvin:");
                            celsiusInFahrenheit.setText("C°:");
                            kelvinInFahrenheit.setText("Kelvin:");
                            celsiusInKelvin.setBackgroundColor(Color.rgb(93, 173, 226));
                            celsiusInKelvin.setTextColor(Color.WHITE);
                            fahrenheitInKelvin.setBackgroundColor(Color.rgb(93, 173, 226));
                            fahrenheitInKelvin.setTextColor(Color.WHITE);
                            int gs = Integer.parseInt(kelvin.getText().toString());
                            double ms = gs*(-272.15);
                            celsiusInKelvin.setText(String.valueOf("C°:\n"+ ms));
                            double fs = gs*(-457.87);
                            fahrenheitInKelvin.setText(String.valueOf("F°:\n" + fs));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });
    }
}
