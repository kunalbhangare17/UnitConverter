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

public class TimeActivity extends AppCompatActivity {

    EditText second,minute,hour,day;
    TextView minuteInSecond,hourInSecond,dayInSecond,secondInMinute,hourInMinute,dayInMinute,secondInHour,minuteInHour,dayInHour,secondInDay,minuteInDay,hourInDay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        second = (EditText) findViewById(R.id.Second_text_box);
        minute = (EditText) findViewById(R.id.Minute_text_box);
        hour = (EditText) findViewById(R.id.hour_text_box);
        day = (EditText) findViewById(R.id.day_text_box);
        minuteInSecond = (TextView) findViewById(R.id.minute_in_second);
        hourInSecond = (TextView) findViewById(R.id.hour_in_second);
        dayInSecond = (TextView) findViewById(R.id.day_in_second);
        secondInMinute = (TextView) findViewById(R.id.second_in_minute);
        hourInMinute = (TextView) findViewById(R.id.hour_in_minute);
        dayInMinute = (TextView) findViewById(R.id.day_in_minute);
        secondInHour = (TextView) findViewById(R.id.second_in_hour);
        minuteInHour = (TextView) findViewById(R.id.minute_in_hour);
        dayInHour = (TextView) findViewById(R.id.day_in_hour);
        secondInDay = (TextView) findViewById(R.id.second_in_day);
        minuteInDay = (TextView) findViewById(R.id.minute_in_day);
        hourInDay = (TextView) findViewById(R.id.hour_in_day);


        second.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (second.hasFocus() == true){

                    second.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                second.setText("0");
                                minuteInSecond.setText("Minute:");
                                hourInSecond.setText("Hour:");
                                dayInSecond.setText("Day:");

                            }
                            return true;
                        }
                    });

                    second.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @RequiresApi(api = Build.VERSION_CODES.N)
                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            secondInMinute.setText("Second");
                            dayInMinute.setText("Hour:");
                            hourInMinute.setText("Day:");
                            dayInHour.setText("Second:");
                            secondInHour.setText("Minute:");
                            minuteInHour.setText("Day:");
                            minuteInDay.setText("Second:");
                            hourInDay.setText("Minute:");
                            secondInDay.setText("Hour:");
                            minuteInSecond.setBackgroundColor(Color.rgb(93, 173, 226));
                            minuteInSecond.setTextColor(Color.WHITE);
                            hourInSecond.setBackgroundColor(Color.rgb(93, 173, 226));
                            hourInSecond.setTextColor(Color.WHITE);
                            dayInSecond.setBackgroundColor(Color.rgb(93, 173, 226));
                            dayInSecond.setTextColor(Color.WHITE);

                            int km = Integer.parseInt(second.getText().toString());
                            double ms = km*0.01666667;
                            minuteInSecond.setText(String.valueOf("Minute:\n"+ ms));
                            double mm = km*0.00001157407;
                            dayInSecond.setText(String.valueOf("Day:\n" + mm));
                            double cm = km*0.0002777778;
                            hourInSecond.setText(String.valueOf("Hour:\n" + cm));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        minute.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (minute.hasFocus() == true){

                    minute.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                minute.setText("0");
                                secondInMinute.setText("Second:");
                                dayInMinute.setText("Hour:");
                                hourInMinute.setText("Day:");

                            }
                            return true;
                        }
                    });

                    minute.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            dayInHour.setText("Second:");
                            secondInHour.setText("Minute:");
                            minuteInHour.setText("Day:");
                            minuteInDay.setText("Second:");
                            hourInDay.setText("Minute:");
                            secondInDay.setText("Hour:");
                            minuteInSecond.setText("Minute:");
                            hourInSecond.setText("Hour:");
                            dayInSecond.setText("Day:");
                            secondInMinute.setBackgroundColor(Color.rgb(93, 173, 226));
                            secondInMinute.setTextColor(Color.WHITE);
                            hourInMinute.setBackgroundColor(Color.rgb(93, 173, 226));
                            hourInMinute.setTextColor(Color.WHITE);
                            dayInMinute.setBackgroundColor(Color.rgb(93, 173, 226));
                            dayInMinute.setTextColor(Color.WHITE);
                            int ms = Integer.parseInt(minute.getText().toString());
                            double km = ms*60;
                            secondInMinute.setText(String.valueOf("Second:\n"+ km));
                            double cm = ms*0.01666667;
                            dayInMinute.setText(String.valueOf("Hour:\n" + cm));
                            double mm = ms*0.0006944444;
                            hourInMinute.setText(String.valueOf("Day:\n" + mm));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        hour.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hour.hasFocus() == true){

                    hour.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                hour.setText("0");
                                dayInHour.setText("Second:");
                                secondInHour.setText("Minute:");
                                minuteInHour.setText("Day:");

                            }
                            return true;
                        }
                    });

                    hour.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            minuteInDay.setText("Second:");
                            hourInDay.setText("Minute:");
                            secondInDay.setText("Hour:");
                            minuteInSecond.setText("Minute:");
                            hourInSecond.setText("Second:");
                            dayInSecond.setText("Day:");
                            secondInMinute.setText("Second:");
                            dayInMinute.setText("Hour:");
                            hourInMinute.setText("Day:");
                            dayInHour.setBackgroundColor(Color.rgb(93, 173, 226));
                            dayInHour.setTextColor(Color.WHITE);
                            secondInHour.setBackgroundColor(Color.rgb(93, 173, 226));
                            secondInHour.setTextColor(Color.WHITE);
                            minuteInHour.setBackgroundColor(Color.rgb(93, 173, 226));
                            minuteInHour.setTextColor(Color.WHITE);
                            int cm = Integer.parseInt(hour.getText().toString());
                            double kc = cm*3600;
                            dayInHour.setText(String.valueOf("Second:\n"+ kc));
                            double mc = cm*60;
                            secondInHour.setText(String.valueOf("Minute:\n" + mc));
                            double mmc = cm*0.04166667;
                            minuteInHour.setText(String.valueOf("Day:\n" + mmc));


                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });

                }
            }
        });

        day.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (day.hasFocus() == true){

                    day.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_DEL)) {

                                day.setText("0");
                                minuteInDay.setText("Second:");
                                hourInDay.setText("Minute:");
                                secondInDay.setText("Hour:");

                            }
                            return true;
                        }
                    });

                    day.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            dayInHour.setText("Second:");
                            secondInHour.setText("Minute:");
                            minuteInHour.setText("Day:");
                            minuteInSecond.setText("Minute:");
                            hourInSecond.setText("Hour:");
                            dayInSecond.setText("Day:");
                            secondInMinute.setText("Second:");
                            dayInMinute.setText("Hour:");
                            hourInMinute.setText("Day:");
                            minuteInDay.setBackgroundColor(Color.rgb(93, 173, 226));
                            minuteInDay.setTextColor(Color.WHITE);
                            hourInDay.setBackgroundColor(Color.rgb(93, 173, 226));
                            hourInDay.setTextColor(Color.WHITE);
                            secondInDay.setBackgroundColor(Color.rgb(93, 173, 226));
                            secondInDay.setTextColor(Color.WHITE);
                            int mms = Integer.parseInt(day.getText().toString());
                            double km = mms*86400;
                            minuteInDay.setText(String.valueOf("Second:\n"+ km));
                            double mm = mms*1440;
                            hourInDay.setText(String.valueOf("Minute:\n" + mm));
                            double cm = mms*24;
                            secondInDay.setText(String.valueOf("Hour:\n" + cm));


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
