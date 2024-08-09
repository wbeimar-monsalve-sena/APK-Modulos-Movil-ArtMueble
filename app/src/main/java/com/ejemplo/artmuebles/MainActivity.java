package com.ejemplo.artmuebles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextClave;
    private Button buttonIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los elementos de la UI
        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextClave = findViewById(R.id.editTextClave);
        buttonIngresar = findViewById(R.id.buttonIngresar);

        // Listener para el botón Ingresar
        buttonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editTextUsuario.getText().toString();
                String clave = editTextClave.getText().toString();

                // Verificar las credenciales (usuario: javierm, clave: 1234)
                if (usuario.equals("javierm") && clave.equals("1234")) {
                    // Si las credenciales son correctas, redirigir a activity_main01
                    Intent intent = new Intent(MainActivity.this, MainActivity01.class);
                    startActivity(intent);
                } else {
                    // Si las credenciales son incorrectas, redirigir a activity_main02
                    Intent intent = new Intent(MainActivity.this, MainActivity02.class);
                    startActivity(intent);
                    // También puedes mostrar un mensaje de error si lo deseas
                    Toast.makeText(MainActivity.this, "Usuario o clave incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
