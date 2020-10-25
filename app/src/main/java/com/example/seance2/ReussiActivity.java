package com.example.seance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ReussiActivity extends AppCompatActivity {

    Button bopen;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reussi);

        bopen=findViewById(R.id.sms);
        bopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = getPackageManager().getLaunchIntentForPackage("com.android.mms");
                startActivity(e);
            }

        });



        Intent i = getIntent();
        float resultat = i.getFloatExtra("result", 0);

        TextView textView = (TextView) findViewById(R.id.resuult);
        textView.setText("Félicitation , Vous étes admis avec une moyenne   " + resultat);
    }

    public void home(View v) {
        Intent i = getIntent();
        float resultat = i.getFloatExtra("result", 0);

        TextView textView = (TextView) findViewById(R.id.resuult);
        textView.setText("Félicitation , Vous étes admis avec une moyenne  " + resultat);

        Intent x = new Intent(this, MainActivity.class);
        startActivity(x);
        Toast.makeText(getApplicationContext(), "Félicitation , Vous étes admis avec une moyenne  " + resultat, Toast.LENGTH_LONG).show();

      }}






