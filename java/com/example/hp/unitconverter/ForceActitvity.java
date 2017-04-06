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

public class ForceActitvity extends AppCompatActivity {

    EditText newton,dyne,kgf,gf;
    TextView dyneInNewton,kgfInNewton,gfInNewton,newtonInDyne,kgfInDyne,gfInDyne,newtonInKgf,dyneInKgf,gfInKgf,newtonInGf,dyneInGf,kgfInGf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force_actitvity);

        newton = (EditText) findViewById(R.id.Newton_text_box);
        dyne = (EditText) findViewById(R.id.Dyne_text_box);
        kgf = (EditText) findViewById(R.id.Kgf_text_box);
        gf = (EditText) findViewById(R.id.gf_text_box);
        dyneInNewton = (TextView) findViewById(R.id.dyne_in_newton);
        kgfInNewton = (TextView) findViewById(R.id.kgf_in_Newton);
        gfInNewton = (TextView) findViewById(R.id.gf_in_Newton);
        newtonInDyne = (TextView) findViewById(R.id.Newton_in_Dyne);
        kgfInDyne = (TextView) findViewById(R.id.kgf_in_Dyne);
        gfInDyne = (TextView) findViewById(R.id.gf_in_Dyne);
        newtonInKgf = (TextView) findViewById(R.id.Newton_in_Kgf);
        dyneInKgf = (TextView) findViewById(R.id.Dyne_in_Kgf);
        gfInKgf = (TextView) findViewById(R.id.Gf_in_Kgf);
        newtonInGf = (TextView) findViewById(R.id.Newton_in_Gf);
        dyneInGf = (TextView) findViewById(R.id.Dyne_in_Gf);
        kgfInGf = (TextView) findViewById(R.id.Kgf_in_Gf);


        newton.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (newton.hasFocus() == true){

                    newton.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                newton.setText("0");
                                dyneInNewton.setText("Dyne:");
                                kgfInNewton.setText("Kgf:");
                                gfInNewton.setText("Gf:");

                            }
                            return true;
                        }
                    });

                    newton.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @RequiresApi(api = Build.VERSION_CODES.N)
                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            newtonInDyne.setText("Newton");
                            gfInDyne.setText("Kgf:");
                            kgfInDyne.setText("Gf:");
                            gfInKgf.setText("Newton:");
                            newtonInKgf.setText("Dyne:");
                            dyneInKgf.setText("Gf:");
                            dyneInGf.setText("Newton:");
                            kgfInGf.setText("Dyne:");
                            newtonInGf.setText("Kgf:");
                            dyneInNewton.setBackgroundColor(Color.rgb(93, 173, 226));
                            dyneInNewton.setTextColor(Color.WHITE);
                            kgfInNewton.setBackgroundColor(Color.rgb(93, 173, 226));
                            kgfInNewton.setTextColor(Color.WHITE);
                            gfInNewton.setBackgroundColor(Color.rgb(93, 173, 226));
                            gfInNewton.setTextColor(Color.WHITE);

                            int km = Integer.parseInt(newton.getText().toString());
                            double ms = km*100000;
                            dyneInNewton.setText(String.valueOf("Dyne:\n"+ ms));
                            double mm = km*0.0001019716;
                            gfInNewton.setText(String.valueOf("Gf:\n" + mm));
                            double cm = km*0.1019716;
                            kgfInNewton.setText(String.valueOf("Kgf:\n" + cm));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        dyne.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (dyne.hasFocus() == true){

                    dyne.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                dyne.setText("0");
                                newtonInDyne.setText("Newton:");
                                gfInDyne.setText("Kgf:");
                                kgfInDyne.setText("Gf:");

                            }
                            return true;
                        }
                    });

                    dyne.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            gfInKgf.setText("Newton:");
                            newtonInKgf.setText("Dyne:");
                            dyneInKgf.setText("Gf:");
                            dyneInGf.setText("Newton:");
                            kgfInGf.setText("Dyne:");
                            newtonInGf.setText("Kgf:");
                            dyneInNewton.setText("Dyne:");
                            kgfInNewton.setText("Kgf:");
                            gfInNewton.setText("Gf:");
                            newtonInDyne.setBackgroundColor(Color.rgb(93, 173, 226));
                            newtonInDyne.setTextColor(Color.WHITE);
                            kgfInDyne.setBackgroundColor(Color.rgb(93, 173, 226));
                            kgfInDyne.setTextColor(Color.WHITE);
                            gfInDyne.setBackgroundColor(Color.rgb(93, 173, 226));
                            gfInDyne.setTextColor(Color.WHITE);
                            int ms = Integer.parseInt(dyne.getText().toString());
                            double km = ms*0.00001;
                            newtonInDyne.setText(String.valueOf("Newton:\n"+ km));
                            double cm = ms*0.000001019716;
                            gfInDyne.setText(String.valueOf("Kgf:\n" + cm));
                            double mm = ms*0.000000001019716;
                            kgfInDyne.setText(String.valueOf("Gf:\n" + mm));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        kgf.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (kgf.hasFocus() == true){

                    kgf.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                kgf.setText("0");
                                gfInKgf.setText("Newton");
                                newtonInKgf.setText("Dyne:");
                                dyneInKgf.setText("Gf:");

                            }
                            return true;
                        }
                    });

                    kgf.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            dyneInGf.setText("Newton:");
                            kgfInGf.setText("Dyne:");
                            newtonInGf.setText("Kgf:");
                            dyneInNewton.setText("Dyne:");
                            kgfInNewton.setText("Newton:");
                            gfInNewton.setText("Gf:");
                            newtonInDyne.setText("Newton:");
                            gfInDyne.setText("Kgf:");
                            kgfInDyne.setText("Gf:");
                            gfInKgf.setBackgroundColor(Color.rgb(93, 173, 226));
                            gfInKgf.setTextColor(Color.WHITE);
                            newtonInKgf.setBackgroundColor(Color.rgb(93, 173, 226));
                            newtonInKgf.setTextColor(Color.WHITE);
                            dyneInKgf.setBackgroundColor(Color.rgb(93, 173, 226));
                            dyneInKgf.setTextColor(Color.WHITE);
                            int cm = Integer.parseInt(kgf.getText().toString());
                            double kc = cm*9.80665;
                            gfInKgf.setText(String.valueOf("Newton:\n"+ kc));
                            double mc = cm*980665;
                            newtonInKgf.setText(String.valueOf("Dyne:\n" + mc));
                            double mmc = cm*0.001;
                            dyneInKgf.setText(String.valueOf("Gf:\n" + mmc));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        gf.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (gf.hasFocus() == true){

                    gf.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                gf.setText("0");
                                dyneInGf.setText("Newton");
                                kgfInGf.setText("Dyne:");
                                newtonInGf.setText("Kgf:");

                            }
                            return true;
                        }
                    });

                    gf.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            gfInKgf.setText("Newton:");
                            newtonInKgf.setText("Dyne:");
                            dyneInKgf.setText("Gf:");
                            dyneInNewton.setText("Dyne:");
                            kgfInNewton.setText("Kgf:");
                            gfInNewton.setText("Gf:");
                            newtonInDyne.setText("Newton:");
                            gfInDyne.setText("Kgf:");
                            kgfInDyne.setText("Gf:");
                            dyneInGf.setBackgroundColor(Color.rgb(93, 173, 226));
                            dyneInGf.setTextColor(Color.WHITE);
                            kgfInGf.setBackgroundColor(Color.rgb(93, 173, 226));
                            kgfInGf.setTextColor(Color.WHITE);
                            newtonInGf.setBackgroundColor(Color.rgb(93, 173, 226));
                            newtonInGf.setTextColor(Color.WHITE);
                            int mms = Integer.parseInt(gf.getText().toString());
                            double km = mms*9806.65;
                            dyneInGf.setText(String.valueOf("Newton:\n"+ km));
                            double mm = mms*980665000;
                            kgfInGf.setText(String.valueOf("Dyne:\n" + mm));
                            double cm = mms*1000;
                            newtonInGf.setText(String.valueOf("Kgf:\n" + cm));


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
