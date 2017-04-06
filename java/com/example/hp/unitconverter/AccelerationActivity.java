package com.example.hp.unitconverter;

import android.graphics.Color;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.annotation.FloatRange;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class AccelerationActivity extends AppCompatActivity {

    EditText meterSquare,footSquare,standardGravity;
    TextView footSquareInMeter,gravityInMeter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceleration);


         meterSquare = (EditText) findViewById(R.id.meterSpuareConversion);
         footSquare = (EditText) findViewById(R.id.foot_spuare_text_box);
         standardGravity = (EditText) findViewById(R.id.standard_gravity_text_box);
        footSquareInMeter = (TextView) findViewById(R.id.to_foot_in_meter);
        gravityInMeter = (TextView) findViewById(R.id.to_gravity_in_meter);
        meterSquare.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (meterSquare.hasFocus() == true){

                    meterSquare.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                meterSquare.setText("0");
                                footSquareInMeter.setText("Foot:");
                                gravityInMeter.setText("Gravity:");
                            }
                            return true;
                        }
                    });

                    meterSquare.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @RequiresApi(api = Build.VERSION_CODES.N)
                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            EditText meterSquare = (EditText) findViewById(R.id.meterSpuareConversion);
                            TextView footSquareInMeter = (TextView) findViewById(R.id.to_foot_in_meter);
                            TextView gravityInMeter = (TextView) findViewById(R.id.to_gravity_in_meter);
                            TextView meterSquareInFoot = (TextView) findViewById(R.id.to_meter_in_foot);
                            TextView gravityInFoot = (TextView) findViewById(R.id.to_gravity_in_foot);
                            EditText standardGravity = (EditText) findViewById(R.id.standard_gravity_text_box);
                            TextView meterSquareInGravity = (TextView) findViewById(R.id.to_meter_in_gravity);
                            TextView footInGravity = (TextView) findViewById(R.id.to_foot_in_gravity);
                            meterSquareInGravity.setText("Meter");
                            footInGravity.setText("Foot:");
                            meterSquareInFoot.setText("Meter:");
                            gravityInFoot.setText("Gravity:");
                            footSquareInMeter.setBackgroundColor(Color.rgb(93, 173, 226));
                            footSquareInMeter.setTextColor(Color.WHITE);
                            gravityInMeter.setBackgroundColor(Color.rgb(93, 173, 226));
                            gravityInMeter.setTextColor(Color.WHITE);
                            int ms = Integer.parseInt(meterSquare.getText().toString());
                            double fs = ms*3.280;
                            footSquareInMeter.setText(String.valueOf("Foot:\n"+ fs));
                            double gs = ms*0.1;
                            gravityInMeter.setText(String.valueOf("Gravity:\n" + gs));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        footSquare.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (footSquare.hasFocus() == true){

                    footSquare.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {
                                EditText footSquare = (EditText) findViewById(R.id.foot_spuare_text_box);
                                TextView meterSquareInFoot = (TextView) findViewById(R.id.to_meter_in_foot);
                                TextView gravityInFoot = (TextView) findViewById(R.id.to_gravity_in_foot);
                                footSquare.setText("0");
                                meterSquareInFoot.setText("Meter:");
                                gravityInFoot.setText("Gravity:");

                            }
                            return true;
                        }
                    });

                    footSquare.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            EditText footSquare = (EditText) findViewById(R.id.foot_spuare_text_box);
                            TextView meterSquareInFoot = (TextView) findViewById(R.id.to_meter_in_foot);
                            TextView gravityInFoot = (TextView) findViewById(R.id.to_gravity_in_foot);
                            TextView footSquareInMeter = (TextView) findViewById(R.id.to_foot_in_meter);
                            TextView gravityInMeter = (TextView) findViewById(R.id.to_gravity_in_meter);
                            EditText standardGravity = (EditText) findViewById(R.id.standard_gravity_text_box);
                            TextView meterSquareInGravity = (TextView) findViewById(R.id.to_meter_in_gravity);
                            TextView footInGravity = (TextView) findViewById(R.id.to_foot_in_gravity);
                            meterSquareInGravity.setText("Meter");
                            footInGravity.setText("Foot:");
                            footSquareInMeter.setText("Foot:");
                            gravityInMeter.setText("Gravity:");
                            meterSquareInFoot.setBackgroundColor(Color.rgb(93, 173, 226));
                            meterSquareInFoot.setTextColor(Color.WHITE);
                            gravityInFoot.setBackgroundColor(Color.rgb(93, 173, 226));
                            gravityInFoot.setTextColor(Color.WHITE);
                            int fs = Integer.parseInt(footSquare.getText().toString());
                            double ms = fs*0.3048;
                            meterSquareInFoot.setText(String.valueOf("Meter:\n"+ ms));
                            double gs = fs*0.031;
                            gravityInFoot.setText(String.valueOf("Gravity:\n" + gs));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        standardGravity.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (standardGravity.hasFocus() == true){

                    standardGravity.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {
                                EditText standardGravity = (EditText) findViewById(R.id.standard_gravity_text_box);
                                TextView meterSquareInGravity = (TextView) findViewById(R.id.to_meter_in_gravity);
                                TextView footInGravity = (TextView) findViewById(R.id.to_foot_in_gravity);
                                standardGravity.setText("0");
                                meterSquareInGravity.setText("Meter");
                                footInGravity.setText("Foot:");

                            }
                            return true;
                        }
                    });

                    standardGravity.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            EditText standardGravity = (EditText) findViewById(R.id.standard_gravity_text_box);
                            TextView meterSquareInGravity = (TextView) findViewById(R.id.to_meter_in_gravity);
                            TextView footInGravity = (TextView) findViewById(R.id.to_foot_in_gravity);
                            TextView meterSquareInFoot = (TextView) findViewById(R.id.to_meter_in_foot);
                            TextView gravityInFoot = (TextView) findViewById(R.id.to_gravity_in_foot);
                            EditText meterSquare = (EditText) findViewById(R.id.meterSpuareConversion);
                            TextView footSquareInMeter = (TextView) findViewById(R.id.to_foot_in_meter);
                            TextView gravityInMeter = (TextView) findViewById(R.id.to_gravity_in_meter);
                            footSquareInMeter.setText("Foot:");
                            gravityInMeter.setText("Gravity:");
                            meterSquareInFoot.setText("Meter:");
                            gravityInFoot.setText("Gravity:");
                            meterSquareInGravity.setBackgroundColor(Color.rgb(93, 173, 226));
                            meterSquareInGravity.setTextColor(Color.WHITE);
                            footInGravity.setBackgroundColor(Color.rgb(93, 173, 226));
                            footInGravity.setTextColor(Color.WHITE);
                            int gs = Integer.parseInt(standardGravity.getText().toString());
                            double ms = gs*9.8;
                            meterSquareInGravity.setText(String.valueOf("Meter:\n"+ ms));
                            double fs = gs*32.17;
                            footInGravity.setText(String.valueOf("Foot:\n" + fs));


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