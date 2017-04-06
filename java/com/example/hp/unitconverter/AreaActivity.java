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

public class AreaActivity extends AppCompatActivity {

    EditText kilometerSquare,meterSquare,centemeterSquare,milimeterSquare;
    TextView meterSquareInKilometer,centemeterSquareInKilometer,MiliMeterinKilometer,Kilometerinmeter,CenteMeterinmeter,MiliMeterinmeter,Kilometerincentemeter,meterincentemeter,MiliMeterincentemeter,Kilometerinmilimeter,CenteMeterinmilimeter,meterinmilimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        meterSquare = (EditText) findViewById(R.id.meter_Square_text_box);
        kilometerSquare = (EditText) findViewById(R.id.Kilometer_text_box);
        centemeterSquare = (EditText) findViewById(R.id.CenterMeter_text_box);
        milimeterSquare = (EditText) findViewById(R.id.MiliMeter_text_box);
        meterSquareInKilometer = (TextView) findViewById(R.id.meter_in_kilometer);
        centemeterSquareInKilometer = (TextView) findViewById(R.id.centerMeter_in_kilometer);
        MiliMeterinKilometer = (TextView) findViewById(R.id.MiliMeter_in_Kilometer);
        meterincentemeter = (TextView) findViewById(R.id.meter_in_centemeter);
        MiliMeterincentemeter = (TextView) findViewById(R.id.MiliMeter_in_centemeter);
        Kilometerincentemeter = (TextView) findViewById(R.id.Kilometer_in_centemeter);
        Kilometerinmeter = (TextView) findViewById(R.id.Kilometer_in_meter);
        MiliMeterinmeter = (TextView) findViewById(R.id.MiliMeter_in_meter);
        CenteMeterinmeter = (TextView) findViewById(R.id.CenteMeter_in_meter);
        CenteMeterinmilimeter = (TextView) findViewById(R.id.CenteMeter_in_milimeter);
        Kilometerinmilimeter = (TextView) findViewById(R.id.Kilometer_in_milimeter);
        meterinmilimeter = (TextView) findViewById(R.id.meter_in_milimeter);


        kilometerSquare.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (kilometerSquare.hasFocus() == true){

                    kilometerSquare.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                kilometerSquare.setText("0");
                                meterSquareInKilometer.setText("m²:");
                                centemeterSquareInKilometer.setText("cm²:");
                                MiliMeterinKilometer.setText("mm²:");

                            }
                            return true;
                        }
                    });

                    kilometerSquare.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @RequiresApi(api = Build.VERSION_CODES.N)
                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            Kilometerinmeter.setText("km²");
                            CenteMeterinmeter.setText("cm²:");
                            MiliMeterinmeter.setText("mm²:");
                            Kilometerincentemeter.setText("km²:");
                            meterincentemeter.setText("m²:");
                            MiliMeterincentemeter.setText("mm²:");
                            Kilometerinmilimeter.setText("km²:");
                            meterinmilimeter.setText("m²:");
                            CenteMeterinmilimeter.setText("cm²:");
                            meterSquareInKilometer.setBackgroundColor(Color.rgb(93, 173, 226));
                            meterSquareInKilometer.setTextColor(Color.WHITE);
                            centemeterSquareInKilometer.setBackgroundColor(Color.rgb(93, 173, 226));
                            centemeterSquareInKilometer.setTextColor(Color.WHITE);
                            MiliMeterinKilometer.setBackgroundColor(Color.rgb(93, 173, 226));
                            MiliMeterinKilometer.setTextColor(Color.WHITE);

                            int km = Integer.parseInt(kilometerSquare.getText().toString());
                            double ms = km*1000000;
                            meterSquareInKilometer.setText(String.valueOf("m²:\n"+ ms));
                            double mm = km* 1000000000 * 100;
                            MiliMeterinKilometer.setText(String.valueOf("mm²:\n" + mm));
                            double cm = km*1000000000*10;
                            centemeterSquareInKilometer.setText(String.valueOf("cm²:\n" + cm));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        meterSquare.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (meterSquare.hasFocus() == true){

                    meterSquare.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                meterSquare.setText("0");
                                Kilometerinmeter.setText("km²:");
                                CenteMeterinmeter.setText("cm²:");
                                MiliMeterinmeter.setText("mm²:");

                            }
                            return true;
                        }
                    });

                    meterSquare.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            Kilometerincentemeter.setText("km²:");
                            meterincentemeter.setText("m²:");
                            MiliMeterincentemeter.setText("mm²:");
                            Kilometerinmilimeter.setText("km²:");
                            meterinmilimeter.setText("m²:");
                            CenteMeterinmilimeter.setText("cm²:");
                            meterSquareInKilometer.setText("m²:");
                            centemeterSquareInKilometer.setText("cm²:");
                            MiliMeterinKilometer.setText("mm²:");
                            Kilometerinmeter.setBackgroundColor(Color.rgb(93, 173, 226));
                            Kilometerinmeter.setTextColor(Color.WHITE);
                            MiliMeterinmeter.setBackgroundColor(Color.rgb(93, 173, 226));
                            MiliMeterinmeter.setTextColor(Color.WHITE);
                            CenteMeterinmeter.setBackgroundColor(Color.rgb(93, 173, 226));
                            CenteMeterinmeter.setTextColor(Color.WHITE);
                            int ms = Integer.parseInt(meterSquare.getText().toString());
                            double km = ms*0.000001;
                            Kilometerinmeter.setText(String.valueOf("km²:\n"+ km));
                            double cm = ms*10000;
                            CenteMeterinmeter.setText(String.valueOf("cm²:\n" + cm));
                            double mm = ms*1000000;
                            MiliMeterinmeter.setText(String.valueOf("mm²:\n" + mm));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        centemeterSquare.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (centemeterSquare.hasFocus() == true){

                    centemeterSquare.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                centemeterSquare.setText("0");
                                Kilometerincentemeter.setText("km²");
                                meterincentemeter.setText("m²:");
                                MiliMeterincentemeter.setText("mm²:");

                            }
                            return true;
                        }
                    });

                    centemeterSquare.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            Kilometerinmilimeter.setText("km²:");
                            meterinmilimeter.setText("m²:");
                            CenteMeterinmilimeter.setText("cm²:");
                            meterSquareInKilometer.setText("m²:");
                            centemeterSquareInKilometer.setText("km²:");
                            MiliMeterinKilometer.setText("mm²:");
                            Kilometerinmeter.setText("km²:");
                            CenteMeterinmeter.setText("cm²:");
                            MiliMeterinmeter.setText("mm²:");
                            Kilometerincentemeter.setBackgroundColor(Color.rgb(93, 173, 226));
                            Kilometerincentemeter.setTextColor(Color.WHITE);
                            meterincentemeter.setBackgroundColor(Color.rgb(93, 173, 226));
                            meterincentemeter.setTextColor(Color.WHITE);
                            MiliMeterincentemeter.setBackgroundColor(Color.rgb(93, 173, 226));
                            MiliMeterincentemeter.setTextColor(Color.WHITE);
                            int cm = Integer.parseInt(centemeterSquare.getText().toString());
                            double kc = cm*0.0000000001;
                            Kilometerincentemeter.setText(String.valueOf("km²:\n"+ kc));
                            double mc = cm*0.0001;
                            meterincentemeter.setText(String.valueOf("m²:\n" + mc));
                            double mmc = cm*100;
                            MiliMeterincentemeter.setText(String.valueOf("mm²:\n" + mmc));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        milimeterSquare.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (milimeterSquare.hasFocus() == true){

                    milimeterSquare.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                milimeterSquare.setText("0");
                                Kilometerinmilimeter.setText("km²");
                                meterinmilimeter.setText("m²:");
                                CenteMeterinmilimeter.setText("cm²:");

                            }
                            return true;
                        }
                    });

                    milimeterSquare.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            Kilometerincentemeter.setText("km²:");
                            meterincentemeter.setText("m²");
                            MiliMeterincentemeter.setText("mm²:");
                            meterSquareInKilometer.setText("m²:");
                            centemeterSquareInKilometer.setText("cm²:");
                            MiliMeterinKilometer.setText("mm²:");
                            Kilometerinmeter.setText("km²:");
                            CenteMeterinmeter.setText("cm²:");
                            MiliMeterinmeter.setText("mm²:");
                            Kilometerinmilimeter.setBackgroundColor(Color.rgb(93, 173, 226));
                            Kilometerinmilimeter.setTextColor(Color.WHITE);
                            meterinmilimeter.setBackgroundColor(Color.rgb(93, 173, 226));
                            meterinmilimeter.setTextColor(Color.WHITE);
                            CenteMeterinmilimeter.setBackgroundColor(Color.rgb(93, 173, 226));
                            CenteMeterinmilimeter.setTextColor(Color.WHITE);
                            int mms = Integer.parseInt(milimeterSquare.getText().toString());
                            double km = mms*0.000000000001;
                            Kilometerinmilimeter.setText(String.valueOf("km²:\n"+ km));
                            double mm = mms*0.000001;
                            meterinmilimeter.setText(String.valueOf("m²:\n" + mm));
                            double cm = mms*0.01;
                            CenteMeterinmilimeter.setText(String.valueOf("cm²:\n" + cm));


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
