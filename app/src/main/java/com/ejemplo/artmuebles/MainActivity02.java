package com.ejemplo.artmuebles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity02 extends AppCompatActivity {

    private Button btnRetry;
    private Button btnNewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);

        // Referencias a los botones
        btnRetry = findViewById(R.id.btn_retry);
        btnNewUser = findViewById(R.id.btn_new_user);

        // Manejo del botón "Reintentar"
        btnRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para reintentar
                Toast.makeText(MainActivity02.this, "Reintentar Login", Toast.LENGTH_SHORT).show();
                // Regresar a la pantalla de login
                Intent intent = new Intent(MainActivity02.this, MainActivity.class);
                startActivity(intent);
                finish(); // Opcional: cerrar la actividad actual
            }
        });

        // Manejo del botón "Ingresar Nuevo Usuario"
        btnNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para ingresar nuevo usuario
                Toast.makeText(MainActivity02.this, "Ingresar Nuevo Usuario", Toast.LENGTH_SHORT).show();
                // Abrir la actividad para ingresar nuevo usuario
                Intent intent = new Intent(MainActivity02.this, MainActivity03.class);
                startActivity(intent);
                finish(); // Opcional: cerrar la actividad actual
            }
        });
    }
}
