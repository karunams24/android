package com.example.gridcalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

 TextView t1,t2;
 EditText e1,e2;

 Button add,sub,mul,div;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView5);
        t2 = findViewById(R.id.textView3);
        e1 = findViewById(R.id.editTextText7);
        e2 = findViewById(R.id.editTextText8);
        add = findViewById(R.id.button9);
        sub = findViewById(R.id.button10);
        mul = findViewById(R.id.button11);
        div = findViewById(R.id.button12);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double f1 = Double.parseDouble(e1.getText().toString());
                double f2 = Double.parseDouble(e2.getText().toString());
                t1.setText("result" + (f1 + f2));

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double f1 = Double.parseDouble(e1.getText().toString());
                double f2 = Double.parseDouble(e2.getText().toString());
                t1.setText("result" + (f1 - f2));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double f1 = Double.parseDouble(e1.getText().toString());
                double f2 = Double.parseDouble(e2.getText().toString());
                t1.setText("result" + (f1 * f2));

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double f1 = Double.parseDouble(e1.getText().toString());
                double f2 = Double.parseDouble(e2.getText().toString());
                t1.setText("result" + (f1 / f2));
            }
        });
    }}










