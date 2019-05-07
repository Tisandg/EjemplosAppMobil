package com.example.tisan.ejemplosappmobil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class HelloWorld extends AppCompatActivity implements View.OnClickListener{

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        btn = findViewById(R.id.boton);
        btn.setOnClickListener(this);
        //actualizarHora();
    }

    @Override
    public void onClick(View v) {
        actualizarHora();
    }

    public void actualizarHora(){
        btn.setText(new Date().toString());
    }
}
