package com.example.basfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    public void llamadoBtnRegistrar(){
        btnRegistrar = (Button) findViewById(R.id.btnRegistrar);
        btnRegistrar.setOnClickListener(new. View.OnClickListener() {
            @Override
             public void OnClick(View view) {
                String nombre = etNombre.getText().toString();
                String apellido = etApellido.get.Text().toString();
                int edad = Integer.parseInt(etEdad.getText().toString());
                String key = UUID.randomUUID().toString();
                Alumno a = new Alumno(nombre,apellido,edad);
                FireBaseDatabase database = FireBaseDataBase.getInstance();
                DatabaseReference myRef = database.getReference("Alumno");
                myRef.setValue(a);
            }
        });
    }
}