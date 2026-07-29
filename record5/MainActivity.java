package com.example.registration;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3;

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);
        e1=findViewById(R.id.editTextText);
        e2=findViewById(R.id.editTextText2);
        e3=findViewById(R.id.editTextText3);
        b1.setOnClickListener(view -> {
            String name = e1.getText().toString();
            String email = e2.getText().toString();
            String pass = e3.getText().toString();


            SharedPreferences sp = getSharedPreferences("ksb", MODE_PRIVATE);

            SharedPreferences.Editor editor = sp.edit();

            editor.putString("name", name);
            editor.putString("emailid", email);
            editor.putString("password", pass);
            editor.apply();

            Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show();

            Intent ab = new Intent(MainActivity.this, MainActivity2.class);
            ab.putExtra("username", name);
            startActivity(ab);
        });
    }
}
