package com.example.toggle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView i1, i2;
    Button t1;

    boolean isFirstImage = true;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = findViewById(R.id.imageView);
        i2 = findViewById(R.id.imageView3);
        t1 = findViewById(R.id.toggleButton5);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isFirstImage) {
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.VISIBLE);
                } else {
                    i1.setVisibility(View.VISIBLE);
                    i2.setVisibility(View.GONE);
                }

                isFirstImage = !isFirstImage;

            }

        });
    }
}
