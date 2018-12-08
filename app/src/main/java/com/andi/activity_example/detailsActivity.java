package com.andi.activity_example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class detailsActivity extends AppCompatActivity {

    TextView von;
    TextView ziel;
    TextView titel;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        von = (TextView) findViewById(R.id.txtVon);
        ziel = (TextView) findViewById(R.id.txtZiel);
        titel = (TextView) findViewById(R.id.txtTitel);
        text = (TextView) findViewById(R.id.txtText);

        Intent i = getIntent();
        String s = i.getStringExtra("id");
        int id = Integer.valueOf(s);

        Toast.makeText(getApplicationContext(), "Mein String ." + s, Toast.LENGTH_LONG).show();

        tipdataBase datenquelle = new tipdataBase();
        ArrayList<modelTip> modell = datenquelle.getData();

        Log.i("Datenliste", "Benutzer " + modell.get(id).getUser());

        von.setText(modell.get(id).getUser());
        ziel.setText(modell.get(id).getText());
        titel.setText(modell.get(id).getName());
        text.setText(modell.get(id).getText());

    }
}
