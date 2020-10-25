package com.example.seance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtSrc1;
    private EditText txtSrc2;
    private EditText txtSrc3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        this.txtSrc1 = (EditText) this.findViewById(R.id.note1);
        this.txtSrc2 = (EditText) this.findViewById(R.id.note2);
        this.txtSrc3 = (EditText) this.findViewById(R.id.note3);




    }

    public void calcul(View v) {
         float res = (Float.parseFloat(txtSrc1.getText().toString()) + Float.parseFloat(txtSrc2.getText().toString()) + Float.parseFloat(txtSrc3.getText().toString())) / 3;






               if (res>10) {

                Intent i = new Intent(this, ReussiActivity.class);
                i.putExtra("result",res);

                startActivity(i);

            }
               else if (res<10) {

                   Intent x = new Intent(this, EchecActivity.class);
                   x.putExtra("result",res);
                   startActivity(x);
               }

        }



    }

