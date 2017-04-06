package com.example.hp.unitconverter;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class SqeedDistanceActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button calculate;
        final EditText speed, distance, time;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqeed_distance);

        //Toast.makeText(SDT.this, "Please Enter Atleast 2 Paramaters", Toast.LENGTH_LONG).show();

        calculate = (Button) findViewById(R.id.button);
        speed = (EditText) findViewById(R.id.Speed);
        distance = (EditText) findViewById(R.id.Distance);
        time = (EditText) findViewById(R.id.Time);

        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if ((time.getText() == null || time.getText().toString().isEmpty()) && (speed.getText() == null || speed.getText().toString().isEmpty())) {
                    Toast.makeText(SqeedDistanceActivity.this, "Please Enter Atleast 2 Paramaters", Toast.LENGTH_LONG).show();
                } else if ((distance.getText() == null || distance.getText().toString().isEmpty()) && (speed.getText() == null || speed.getText().toString().isEmpty())) {
                    Toast.makeText(SqeedDistanceActivity.this, "Please Enter Atleast 2 Paramaters", Toast.LENGTH_LONG).show();
                } else if ((time.getText() == null || time.getText().toString().isEmpty()) && (distance.getText() == null || distance.getText().toString().isEmpty())) {
                    Toast.makeText(SqeedDistanceActivity.this, "Please Enter Atleast 2 Paramaters", Toast.LENGTH_LONG).show();
                } else if ((time.getText() != null || !(time.getText().toString().isEmpty())) && (speed.getText() != null || !(speed.getText().toString().isEmpty())) && (distance.getText() == null || distance.getText().toString().isEmpty())) {
                    //to find distance
                    float spe, dis, ti;
                    ti = Float.valueOf(time.getText().toString());
                    spe = Float.valueOf(speed.getText().toString());
                    dis = spe * ti;
                    distance.setText(String.valueOf(dis));
                    Toast.makeText(SqeedDistanceActivity.this, "if", Toast.LENGTH_LONG).show();
                } else if ((distance.getText() != null || !(distance.getText().toString().isEmpty())) && (time.getText() != null || !(time.getText().toString().isEmpty())) && (speed.getText() == null || speed.getText().toString().isEmpty())) {
                    //to find speed
                    float spe1, dis1, ti1;
                    ti1 = Float.valueOf(time.getText().toString());
                    dis1 = Float.valueOf(distance.getText().toString());
                    spe1 = dis1 / ti1;
                    speed.setText(String.valueOf(spe1));
                    Toast.makeText(SqeedDistanceActivity.this, "else1", Toast.LENGTH_LONG).show();
                } else if ((speed.getText() != null || !(speed.getText().toString().isEmpty())) && (distance.getText() != null || !(distance.getText().toString().isEmpty())) && (time.getText() == null || time.getText().toString().isEmpty())) {
                    //to find time
                    float spe2, dis2, ti2;
                    spe2 = Float.valueOf(speed.getText().toString());
                    dis2 = Float.valueOf(distance.getText().toString());
                    ti2 = dis2 / spe2;
                    time.setText(String.valueOf(ti2));
                    Toast.makeText(SqeedDistanceActivity.this, "else2", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(SqeedDistanceActivity.this, "Please Enter only 2 Paramaters", Toast.LENGTH_LONG).show();

                }
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("SqeedDistance Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
