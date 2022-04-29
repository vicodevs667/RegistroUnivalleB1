package com.example.registrounivalle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Atributos -> representan sus vistas
    private EditText etNombre, etApellido, etEmail, etCelular, etCodigoEstudiante;
    private Button btnRegistrar;
    private Switch swEstudiante;

    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        //Una vista puede ser configurada para ocultarla al usuario
        etCodigoEstudiante.setVisibility(View.GONE);
        btnRegistrar.setOnClickListener(view -> pasarPantalla());
        //Evento para los Checkboxes y Switches
        //para controlar cuando se marca o no el componente
        swEstudiante.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                gestionarVistaCodigo(b);
            }
        });
        Toast.makeText(this,"Creando",Toast.LENGTH_SHORT).show();
    }

    //Otros estados


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Arrancando",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Corriendo",Toast.LENGTH_SHORT).show();
    }

    private void pasarPantalla() {
        //Para pasar de una pantalla a otra necesitan configurar
        //un componente llamado INTENT, quiere decir una intencion
        //de querer pasar de una pantalla A a una pantalla b
        //al crear la instancia del Intent, deben pasar como parametros
        //la representacion de las clases de cada pantalla, partiendo
        //del concepto estoy en la pantalla A, y quiero ir a la pantalla B
        Intent intencion = new Intent(this, HomeActivity.class);
        startActivity(intencion);
    }

    private void gestionarVistaCodigo(boolean marcado) {
        if(marcado) {
            etCodigoEstudiante.setVisibility(View.VISIBLE);
        } else {
            etCodigoEstudiante.setVisibility(View.GONE);
        }
    }

    private void mostrarMensaje(boolean b) {
        String mensaje = "no estoy marcado";
        if(b) {
           mensaje="estoy marcado";
        }
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
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