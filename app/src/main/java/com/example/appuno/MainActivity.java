package com.example.appuno;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public EditText editText;
    public EditText txtApe;
    public EditText tv1;
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        showToast("This OnCreate");
        editText = findViewById(R.id.txtEditName);
        txtApe = findViewById(R.id.txtApellido);
        tv1 = findViewById(R.id.tvSaludo);
        String user = getIntent().getStringExtra("user");
        editText.setText("Holaaaa"+ user);
    }

    public void Saludar(View view){
        String nombre = editText.getText().toString();
        String apellido = txtApe.getText().toString();
        Toast.makeText(this, "Hola "+nombre +" " +apellido, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart(){
        super.onStart();
        //Toast.makeText(this, "This OnStart", Toast.LENGTH_SHORT).show();
        showToast("This OnStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        //Toast.makeText(this, "This OnResume", Toast.LENGTH_SHORT).show();
        showToast("This OnResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        //Toast.makeText(this, "This OnPause", Toast.LENGTH_SHORT).show();
        showToast("This OnPause");
    }
}