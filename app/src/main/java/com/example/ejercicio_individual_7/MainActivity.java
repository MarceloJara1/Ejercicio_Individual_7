package com.example.ejercicio_individual_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mostrar mensaje de bienvenida con Toast
        Toast.makeText(this, "¡Bienvenido/a a mi aplicación!", Toast.LENGTH_SHORT).show();

    }

    public void salir(View view){
        finish();
    }



}