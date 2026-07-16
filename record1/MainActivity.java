package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView t1, t2, t3;
    EditText e1, e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link

        b = findViewById(R.id.button2);
        t1 = findViewById(R.id.textView5);
        t2 = findViewById(R.id.textView6);
        t3 = findViewById(R.id.textView7);
        e1 = findViewById(R.id.editTextText3);
        e2 = findViewById(R.id.editTextTextPassword2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = e1.getText().toString().trim();
                String p = e2.getText().toString().trim();

                if (n.equals("abc") && p.equals("123")) {

                    Toast.makeText(MainActivity.this,
                            "Login Successfully",
                            Toast.LENGTH_SHORT).show();

                } else {

                    Toast.makeText(MainActivity.this,
                            "Invalid username or password",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
