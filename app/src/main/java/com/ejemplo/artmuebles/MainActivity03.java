package com.ejemplo.artmuebles;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity03 extends AppCompatActivity {

    private EditText etNombre, etApellido, etEmail, etTelefono, etCiudad, etPassword;
    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main03);

        // Inicializar los campos de entrada y el botón
        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        etEmail = findViewById(R.id.etEmail);
        etTelefono = findViewById(R.id.etTelefono);
        etCiudad = findViewById(R.id.etCiudad);
        etPassword = findViewById(R.id.etPassword);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        // Acción al hacer clic en el botón "Registrar"
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarUsuario();
            }
        });
    }

    private void registrarUsuario() {
        String nombre = etNombre.getText().toString().trim();
        String apellido = etApellido.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String telefono = etTelefono.getText().toString().trim();
        String ciudad = etCiudad.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        // Validar que los campos no estén vacíos
        if (TextUtils.isEmpty(nombre) || TextUtils.isEmpty(apellido) || TextUtils.isEmpty(email)
                || TextUtils.isEmpty(telefono) || TextUtils.isEmpty(ciudad) || TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        // Aquí puedes agregar la lógica para registrar el usuario en la base de datos
        Toast.makeText(this, "Usuario registrado correctamente", Toast.LENGTH_SHORT).show();
        // Después de registrar el usuario, podrías redirigirlo a la pantalla de inicio de sesión o a otra parte de la aplicación.
    }
}