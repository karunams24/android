package com.example.intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2;
    Button b;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.textView5);
        t2=findViewById(R.id.textView6);
        b=findViewById(R.id.button2);

        Bundle extras=getIntent().getExtras();
        String name=extras.getString("name");
        String age=extras.getString("age");
        t1.setText(name);
        t2.setText(age);

    }

    public void onClick(View view) {
        Intent i=new Intent(this,MainActivity3.class);
        startActivity(i);
    }
}
