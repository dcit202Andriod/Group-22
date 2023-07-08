package com.example.recipe_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        EditText username = findViewById(R.id.username);
        MaterialButton regbtn = findViewById(R.id.signupbtn);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username1 = username.getText().toString();
                Toast.makeText(Signup.this, "Username is " + username1, Toast.LENGTH_SHORT).show();

                // Create an Intent to navigate to the desired activity
                Intent intent = new Intent(Signup.this, page2.class);
                intent.putExtra("USERNAME", username1);
                startActivity(intent);
            }
        });
    }
}
