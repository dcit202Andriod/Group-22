package com.example.recipe_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Signin extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    Button registerButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        registerButton = findViewById(R.id.register);

        Intent intent = new Intent(Signin.this, Signup.class);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Rene") && password.getText().toString().equals("1234")) {
                    Toast.makeText(Signin.this, "Login Successful!", Toast.LENGTH_SHORT).show();

                    // Start the second activity here
                    Intent intent = new Intent(Signin.this, page2.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Signin.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }


        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the Signup activity here
                Intent intent = new Intent(Signin.this, Signup.class);
                startActivity(intent);
            }
        });
    }
}