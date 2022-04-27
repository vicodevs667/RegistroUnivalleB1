package com.example.registrounivalle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    //Atributos -> representan sus vistas
    private EditText etNombre, etApellido, etEmail, etCelular, etCodigoEstudiante;
    private Button btnRegistrar;
    private Switch swEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
    }

    private void inicializarVistas() {
        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        etEmail = findViewById(R.id.etEmail);
        etCelular = findViewById(R.id.etCelular);
        etCodigoEstudiante = findViewById(R.id.etCodigoEstudiante);
        swEstudiante = findViewById(R.id.swEstudiante);
        btnRegistrar = findViewById(R.id.btnRegistrar);
    }
}