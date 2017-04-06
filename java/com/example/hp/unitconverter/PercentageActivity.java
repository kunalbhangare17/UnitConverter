package com.example.hp.unitconverter;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class PercentageActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button calculate;
        final EditText val, outof, per;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);

        calculate = (Button) findViewById(R.id.percent1);
        val = (EditText) findViewById(R.id.value);
        outof = (EditText) findViewById(R.id.outoff);
        per = (EditText) findViewById(R.id.perr);

        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if ((val.getText() == null || val.getText().toString().isEmpty()) && (outof.getText() == null || outof.getText().toString().isEmpty())) {
                    Toast.makeText(PercentageActivity.this, "Please Enter Atleast 2 Paramaters", Toast.LENGTH_LONG).show();
                } else if ((val.getText() == null || val.getText().toString().isEmpty()) && (per.getText() == null || per.getText().toString().isEmpty())) {
                    Toast.makeText(PercentageActivity.this, "Please Enter Atleast 2 Paramaters", Toast.LENGTH_LONG).show();
                } else if ((per.getText() == null || per.getText().toString().isEmpty()) && (outof.getText() == null || outof.getText().toString().isEmpty())) {
                    Toast.makeText(PercentageActivity.this, "Please Enter Atleast 2 Paramaters", Toast.LENGTH_LONG).show();
                } else if ((val.getText() != null || !(val.getText().toString().isEmpty())) && (outof.getText() != null || !(outof.getText().toString().isEmpty())) && (per.getText() == null || per.getText().toString().isEmpty())) {
                    //to find distance
                    float value, out, perc;
                    value = Float.valueOf(val.getText().toString());
                    out = Float.valueOf(outof.getText().toString());
                    perc = (value / out) * 100;
                    per.setText(String.valueOf(perc));
                } else if ((val.getText() != null || !(val.getText().toString().isEmpty())) && (per.getText() != null || !(per.getText().toString().isEmpty())) && (outof.getText() == null || outof.getText().toString().isEmpty())) {
                    //to find speed
                    float value1, out1, perc1;
                    value1 = Float.valueOf(val.getText().toString());
                    perc1 = Float.valueOf(per.getText().toString());
                    out1 = (value1 / perc1) * 100;
                    outof.setText(String.valueOf(out1));
                } else if ((outof.getText() != null || !(outof.getText().toString().isEmpty())) && (per.getText() != null || !(per.getText().toString().isEmpty())) && (val.getText() == null || val.getText().toString().isEmpty())) {
                    //to find time
                    float value2, out2, perc2;
                    out2 = Float.valueOf(outof.getText().toString());
                    perc2 = Float.valueOf(per.getText().toString());
                    value2 = (perc2 * out2) / 100;
                    val.setText(String.valueOf(value2));
                } else {
                    Toast.makeText(PercentageActivity.this, "Please Enter only 2 Paramaters", Toast.LENGTH_LONG).show();

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
                .setName("Percentage Page") // TODO: Define a title for the content shown.
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
