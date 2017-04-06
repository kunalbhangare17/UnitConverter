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

import static com.example.hp.unitconverter.R.drawable.proportion;

public class ProportionActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//
        Button calculate;
        final EditText numone, numtwo, denone, dentwo;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proportion);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
        calculate = (Button) findViewById(R.id.prop1);
        numone = (EditText) findViewById(R.id.num1);
        numtwo = (EditText) findViewById(R.id.num2);
        denone = (EditText) findViewById(R.id.den1);
        dentwo = (EditText) findViewById(R.id.den2);
        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((numtwo.getText().toString() == null) || (numtwo.getText().toString().isEmpty())) && ((denone.getText().toString() == null) || (denone.getText().toString().isEmpty())) && ((dentwo.getText().toString() == null) || (dentwo.getText().toString().isEmpty()))) {
                    Toast.makeText(ProportionActivity.this, "Please Enter Atleast 3 Paramaters", Toast.LENGTH_LONG).show();
                } else if (((numone.getText().toString() == null) || (numone.getText().toString().isEmpty())) && ((denone.getText().toString() == null) || (denone.getText().toString().isEmpty())) && ((dentwo.getText().toString() == null) || (dentwo.getText().toString().isEmpty()))) {
                    Toast.makeText(ProportionActivity.this, "Please Enter Atleast 3 Paramaters", Toast.LENGTH_LONG).show();
                } else if (((numtwo.getText().toString() == null) || (numtwo.getText().toString().isEmpty())) && ((numone.getText().toString() == null) || (numone.getText().toString().isEmpty())) && ((dentwo.getText().toString() == null) || (dentwo.getText().toString().isEmpty()))) {
                    Toast.makeText(ProportionActivity.this, "Please Enter Atleast 3 Paramaters", Toast.LENGTH_LONG).show();
                } else if (((numtwo.getText().toString() == null) || (numtwo.getText().toString().isEmpty())) && ((denone.getText().toString() == null) || (denone.getText().toString().isEmpty())) && ((numone.getText().toString() == null) || (numone.getText().toString().isEmpty()))) {
                    Toast.makeText(ProportionActivity.this, "Please Enter Atleast 3 Paramaters", Toast.LENGTH_LONG).show();
                } else if (((numone.getText().toString() == null) || (numone.getText().toString().isEmpty())) && ((numtwo.getText().toString() == null) || (numtwo.getText().toString().isEmpty()))) {
                    Toast.makeText(ProportionActivity.this, "Please Enter Atleast 3 Paramaters", Toast.LENGTH_LONG).show();
                } else if (((numone.getText().toString() == null) || (numone.getText().toString().isEmpty())) && ((dentwo.getText().toString() == null) || (dentwo.getText().toString().isEmpty()))) {
                    Toast.makeText(ProportionActivity.this, "Please Enter Atleast 3 Paramaters", Toast.LENGTH_LONG).show();
                } else if (((numone.getText().toString() == null) || (numone.getText().toString().isEmpty())) && ((denone.getText().toString() == null) || (denone.getText().toString().isEmpty()))) {
                    Toast.makeText(ProportionActivity.this, "Please Enter Atleast 3 Paramaters", Toast.LENGTH_LONG).show();
                } else if (((numtwo.getText().toString() == null) || (numtwo.getText().toString().isEmpty())) && ((dentwo.getText().toString() == null) || (dentwo.getText().toString().isEmpty()))) {
                    Toast.makeText(ProportionActivity.this, "Please Enter Atleast 3 Paramaters", Toast.LENGTH_LONG).show();
                } else if (((numtwo.getText().toString() == null) || (numtwo.getText().toString().isEmpty())) && ((denone.getText().toString() == null) || (denone.getText().toString().isEmpty()))) {
                    Toast.makeText(ProportionActivity.this, "Please Enter Atleast 3 Paramaters", Toast.LENGTH_LONG).show();
                } else if (((dentwo.getText().toString() == null) || (dentwo.getText().toString().isEmpty())) && ((denone.getText().toString() == null) || (denone.getText().toString().isEmpty()))) {
                    Toast.makeText(ProportionActivity.this, "Please Enter Atleast 3 Paramaters", Toast.LENGTH_LONG).show();
                } else if ((numone.getText() == null) || (numone.getText().toString().isEmpty())) {
                    float num01, num02, den01, den02;
                    num02 = Float.valueOf(numtwo.getText().toString());
                    den01 = Float.valueOf(denone.getText().toString());
                    den02 = Float.valueOf(dentwo.getText().toString());
                    num01 = (num02 * den01) / den02;
                    numone.setText(String.valueOf(num01));
                } else if ((numtwo.getText().toString() == null) || (numtwo.getText().toString().isEmpty())) {
                    float num01, num02, den01, den02;
                    num01 = Float.valueOf(numone.getText().toString());
                    den01 = Float.valueOf(denone.getText().toString());
                    den02 = Float.valueOf(dentwo.getText().toString());
                    num02 = (num01 * den02) / den01;
                    numtwo.setText(String.valueOf(num02));
                } else if ((denone.getText().toString() == null) || (denone.getText().toString().isEmpty())) {
                    float num01, num02, den01, den02;
                    num02 = Float.valueOf(numtwo.getText().toString());
                    num01 = Float.valueOf(numone.getText().toString());
                    den02 = Float.valueOf(dentwo.getText().toString());
                    den01 = (num01 * den02) / num02;
                    denone.setText(String.valueOf(den01));
                } else if ((dentwo.getText().toString() == null) || (dentwo.getText().toString().isEmpty())) {
                    float num01, num02, den01, den02;
                    num02 = Float.valueOf(numtwo.getText().toString());
                    num01 = Float.valueOf(numone.getText().toString());
                    den01 = Float.valueOf(denone.getText().toString());
                    den02 = (num02 * den01) / num01;
                    dentwo.setText(String.valueOf(den02));
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
                .setName("Proportion Page") // TODO: Define a title for the content shown.
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
