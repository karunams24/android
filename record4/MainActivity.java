package com.example.validation;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextText3, editTextText, editTextText4;

    RadioGroup radioGroup;

    Spinner count;

    CheckBox checkBox;

    Button button;

    String[] country = {"Select country", "India", "USA", "UK", "Canada",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editTextText3 = findViewById(R.id.editTextText3);
        editTextText = findViewById(R.id.editTextText);
        editTextText4 = findViewById(R.id.editTextText4);
        radioGroup = findViewById(R.id.radioGroup);
        count = findViewById(R.id.spinner);
        checkBox = findViewById(R.id.checkBox);
        button = findViewById(R.id.button);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                country
        );
        count.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextText.getText().toString();
                String email = editTextText3.getText().toString();
                String password = editTextText4.getText().toString();

                if (name.isEmpty()) {
                    editTextText.setError("Enter name");
                    return;
                }
                if (email.isEmpty()) {
                    editTextText3.setError("Enter email");
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    editTextText3.setError("Invalid Email");
                    return;
                }

                if (password.isEmpty()) {
                    editTextText4.setError("Enter password");
                    return;
                }
                if (password.length() < 6) {
                    editTextText4.setError("Password must be at least 8 characters");
                    return;
                }
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(MainActivity.this,
                            "Select Gender", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (count.getSelectedItemPosition() == 0) {
                    Toast.makeText(MainActivity.this,
                            "Select Country",
                            Toast.LENGTH_SHORT).show();
                    return;

                }
                if (!checkBox.isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Accept Terms and Conditions",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(MainActivity.this,
                        "Validation Successful",
                        Toast.LENGTH_SHORT).show();
            }

        });

    }
}




