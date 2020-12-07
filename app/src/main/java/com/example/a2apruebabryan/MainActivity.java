package com.example.a2apruebabryan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Carrito;
    private Button Comprar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent myintent = new Intent(this, segundaPagina.class);

        Carrito = (Button)findViewById(R.id.Carrito);
        Comprar = (Button)findViewById(R.id.Comprar);

        Comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (MainActivity.this, segundaPagina.class);
                startActivity(intent);

            }
        });

    }


    }
