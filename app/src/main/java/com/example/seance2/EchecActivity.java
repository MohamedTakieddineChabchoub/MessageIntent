package com.example.seance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class EchecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echec);

        Intent x = getIntent();
        float resultat = x.getFloatExtra("result",0  );

        TextView textView = (TextView) findViewById(R.id.resuult);
        textView.setText("Domage , Vous n'avez pas admis , votre moyenne est "  + resultat);
    }
    public void home(View v)
    {
        Intent i = getIntent();
        float resultat = i.getFloatExtra("result", 0);

        TextView textView = (TextView) findViewById(R.id.resuult);
        textView.setText("Domage , Vous n'avez pas admis , Votre une moyenne " + resultat);

        Intent x = new Intent(this, MainActivity.class);
        startActivity(x);
        Toast.makeText(getApplicationContext(), "Domage , Vous n'avez pas admis , Votre une moyenne  " + resultat ,  Toast.LENGTH_LONG  ).show();
    }
    }
