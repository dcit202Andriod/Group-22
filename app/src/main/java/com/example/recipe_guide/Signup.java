package com.example.recipe_guide;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        EditText username = findViewById(R.id.username);

        EditText password = findViewById(R.id.password);
        Button regbtn = findViewById(R.id.signupbtn);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameText = username.getText().toString();

                String passwordText = password.getText().toString();

                if (TextUtils.isEmpty(usernameText) || TextUtils.isEmpty(passwordText)) {
                    Toast.makeText(Signup.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Signup.this, "Username is " + usernameText + ", Password is " + passwordText, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Signup.this, Signin.class);
                    intent.putExtra("USERNAME", usernameText);

                    intent.putExtra("PASSWORD", passwordText);
                    startActivity(intent);
                }
            }
        });
    }
}
