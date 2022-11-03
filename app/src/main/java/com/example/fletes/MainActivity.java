package com.example.fletes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fletes.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activarBotones();
    }

    private void activarBotones() {
        Button btSalir= findViewById(R.id.btSalir);
        btSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accionBotonSalir();
            }
        });

        Button btFletero= findViewById(R.id.btFletero);
        btFletero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accionBotonFletero();
            }
        });

        Button btCliente= findViewById(R.id.btCliente);
        btCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accionBotonCliente();
            }
        });
    }

    private void accionBotonCliente() {
        Intent loginActivity = new Intent(this, LoginActivity.class);
        navigationActivity.putExtra("Cliente","No registrado");
        startActivity(loginActivity);
    }

    private void accionBotonFletero() {
        Intent loginActivity = new Intent(this, LoginActivity.class);
        startActivity(loginActivity);
    }

    private void accionBotonSalir() {
        finish();
    }
}