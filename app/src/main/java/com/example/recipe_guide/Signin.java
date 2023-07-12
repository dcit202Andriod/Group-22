package com.example.recipe_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


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

        Intent signupIntent = getIntent();
        String signupUsername = signupIntent.getStringExtra("USERNAME");
        String signupPassword = signupIntent.getStringExtra("PASSWORD");

        username.setText(signupUsername);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredUsername = username.getText().toString();
                String enteredPassword = password.getText().toString();

                if (enteredUsername.equals(signupUsername) && enteredPassword.equals(signupPassword)) {
                    Toast.makeText(Signin.this, "Login Successful!", Toast.LENGTH_SHORT).show();


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
