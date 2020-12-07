package com.example.a2apruebabryan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class segundaPagina extends AppCompatActivity {

    private Button Atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pagina);

        Atras = (Button)findViewById(R.id.Atras);

        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(segundaPagina.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}