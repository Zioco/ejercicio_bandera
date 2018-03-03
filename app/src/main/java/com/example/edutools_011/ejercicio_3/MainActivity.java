package com.example.edutools_011.ejercicio_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imagen;
    RadioGroup migrupo;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = findViewById(R.id.imageView);
        migrupo = findViewById(R.id.grupo);
        rb1 = findViewById(R.id.peru);
        rb2 = findViewById(R.id.esdados_unidos);
        rb3 = findViewById(R.id.alemania);
        rb4 = findViewById(R.id.reino_unido);

        migrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //Toast.makeText(getApplicationContext(), String.valueOf(i), Toast.LENGTH_LONG).show();
                switch (i)
                {
                    case R.id.peru:
                        imagen.setImageResource(R.drawable.bandera_peru);
                        break;
                    case R.id.esdados_unidos:
                        imagen.setImageResource(R.drawable.bandera_eeuu);
                        break;
                    case R.id.alemania:
                        imagen.setImageResource(R.drawable.bandera_alemania);
                        break;
                    case R.id.reino_unido:
                        imagen.setImageResource(R.drawable.bandera_reinounido);
                        break;
                }
            }
        });
    }
}