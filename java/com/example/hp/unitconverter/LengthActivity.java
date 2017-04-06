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

public class LengthActivity extends AppCompatActivity {

    EditText kilometer,mile,yard,inch;
    TextView mileInKilometer,yardInkilometer,inchInKilometer,kilometerInMile,yardInMile,inchInMile,kilometerInyard,mileInYard,inchInYard,kilometerInInch,mileInInch,yardInInch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        kilometer = (EditText) findViewById(R.id.Kilometer_text_box);
        mile = (EditText) findViewById(R.id.Mile_text_box);
        yard = (EditText) findViewById(R.id.yard_text_box);
        inch = (EditText) findViewById(R.id.inch_text_box);
        mileInKilometer = (TextView) findViewById(R.id.mile_in_kilometer);
        yardInkilometer = (TextView) findViewById(R.id.yard_in_Kilometer);
        inchInKilometer = (TextView) findViewById(R.id.inch_in_kilometer);
        kilometerInMile = (TextView) findViewById(R.id.Kilometer_in_Mile);
        yardInMile = (TextView) findViewById(R.id.Yard_in_Mile);
        inchInMile = (TextView) findViewById(R.id.Inch_in_Mile);
        kilometerInyard = (TextView) findViewById(R.id.Kilometer_in_Yard);
        mileInYard = (TextView) findViewById(R.id.Mile_in_Yard);
        inchInYard = (TextView) findViewById(R.id.Inch_in_Yard);
        kilometerInInch = (TextView) findViewById(R.id.Kilometer_in_Inch);
        mileInInch = (TextView) findViewById(R.id.Yard_in_Inch);
        yardInInch = (TextView) findViewById(R.id.Mile_in_Inch);


        kilometer.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (kilometer.hasFocus() == true){

                    kilometer.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                kilometer.setText("0");
                                mileInKilometer.setText("Mile:");
                                yardInkilometer.setText("Yard:");
                                inchInKilometer.setText("Inch:");

                            }
                            return true;
                        }
                    });

                    kilometer.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @RequiresApi(api = Build.VERSION_CODES.N)
                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            kilometerInMile.setText("Km");
                            inchInMile.setText("Yard:");
                            yardInMile.setText("Inch:");
                            inchInYard.setText("Km:");
                            kilometerInyard.setText("Mile:");
                            mileInYard.setText("Inch:");
                            mileInInch.setText("Km:");
                            yardInInch.setText("Mile:");
                            kilometerInInch.setText("Yard:");
                            mileInKilometer.setBackgroundColor(Color.rgb(93, 173, 226));
                            mileInKilometer.setTextColor(Color.WHITE);
                            yardInkilometer.setBackgroundColor(Color.rgb(93, 173, 226));
                            yardInkilometer.setTextColor(Color.WHITE);
                            inchInKilometer.setBackgroundColor(Color.rgb(93, 173, 226));
                            inchInKilometer.setTextColor(Color.WHITE);

                            int km = Integer.parseInt(kilometer.getText().toString());
                            double ms = km*0.6213712;
                            mileInKilometer.setText(String.valueOf("Mile:\n"+ ms));
                            double mm = km*39370.08;
                            inchInKilometer.setText(String.valueOf("Inch:\n" + mm));
                            double cm = km*1093.613;
                            yardInkilometer.setText(String.valueOf("Yard:\n" + cm));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        mile.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (mile.hasFocus() == true){

                    mile.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                mile.setText("0");
                                kilometerInMile.setText("Km:");
                                inchInMile.setText("Yard:");
                                yardInMile.setText("Inch:");

                            }
                            return true;
                        }
                    });

                    mile.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            inchInYard.setText("Km:");
                            kilometerInyard.setText("Mile:");
                            mileInYard.setText("Inch:");
                            mileInInch.setText("Km:");
                            yardInInch.setText("Mile:");
                            kilometerInInch.setText("Yard:");
                            mileInKilometer.setText("Mile:");
                            yardInkilometer.setText("Yard:");
                            inchInKilometer.setText("Inch:");
                            kilometerInMile.setBackgroundColor(Color.rgb(93, 173, 226));
                            kilometerInMile.setTextColor(Color.WHITE);
                            yardInMile.setBackgroundColor(Color.rgb(93, 173, 226));
                            yardInMile.setTextColor(Color.WHITE);
                            inchInMile.setBackgroundColor(Color.rgb(93, 173, 226));
                            inchInMile.setTextColor(Color.WHITE);
                            int ms = Integer.parseInt(mile.getText().toString());
                            double km = ms*1.609344;
                            kilometerInMile.setText(String.valueOf("Km:\n"+ km));
                            double cm = ms*1760;
                            inchInMile.setText(String.valueOf("Yard:\n" + cm));
                            double mm = ms*63360;
                            yardInMile.setText(String.valueOf("Inch:\n" + mm));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        yard.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (yard.hasFocus() == true){

                    yard.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                yard.setText("0");
                                inchInYard.setText("Km");
                                kilometerInyard.setText("Mile:");
                                mileInYard.setText("Inch:");

                            }
                            return true;
                        }
                    });

                    yard.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            mileInInch.setText("Km:");
                            yardInInch.setText("Mile:");
                            kilometerInInch.setText("Yard:");
                            mileInKilometer.setText("Mile:");
                            yardInkilometer.setText("Km:");
                            inchInKilometer.setText("Inch:");
                            kilometerInMile.setText("Km:");
                            inchInMile.setText("Yard:");
                            yardInMile.setText("Inch:");
                            inchInYard.setBackgroundColor(Color.rgb(93, 173, 226));
                            inchInYard.setTextColor(Color.WHITE);
                            kilometerInyard.setBackgroundColor(Color.rgb(93, 173, 226));
                            kilometerInyard.setTextColor(Color.WHITE);
                            mileInYard.setBackgroundColor(Color.rgb(93, 173, 226));
                            mileInYard.setTextColor(Color.WHITE);
                            int cm = Integer.parseInt(yard.getText().toString());
                            double kc = cm*0.0009144;
                            inchInYard.setText(String.valueOf("Km:\n"+ kc));
                            double mc = cm*0.0005681818;
                            kilometerInyard.setText(String.valueOf("Mile:\n" + mc));
                            double mmc = cm*36;
                            mileInYard.setText(String.valueOf("Inch:\n" + mmc));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        inch.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (inch.hasFocus() == true){

                    inch.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                inch.setText("0");
                                mileInInch.setText("Km");
                                yardInInch.setText("Mile:");
                                kilometerInInch.setText("Yard:");

                            }
                            return true;
                        }
                    });

                    inch.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            inchInYard.setText("Km:");
                            kilometerInyard.setText("Mile:");
                            mileInYard.setText("Inch:");
                            mileInKilometer.setText("Mile:");
                            yardInkilometer.setText("Yard:");
                            inchInKilometer.setText("Inch:");
                            kilometerInMile.setText("Km:");
                            inchInMile.setText("Yard:");
                            yardInMile.setText("Inch:");
                            mileInInch.setBackgroundColor(Color.rgb(93, 173, 226));
                            mileInInch.setTextColor(Color.WHITE);
                            yardInInch.setBackgroundColor(Color.rgb(93, 173, 226));
                            yardInInch.setTextColor(Color.WHITE);
                            kilometerInInch.setBackgroundColor(Color.rgb(93, 173, 226));
                            kilometerInInch.setTextColor(Color.WHITE);
                            int mms = Integer.parseInt(inch.getText().toString());
                            double km = mms*0.0000254;
                            mileInInch.setText(String.valueOf("Km:\n"+ km));
                            double mm = mms*0.00001578283;
                            yardInInch.setText(String.valueOf("Mile:\n" + mm));
                            double cm = mms*0.02777778;
                            kilometerInInch.setText(String.valueOf("Yard:\n" + cm));


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
