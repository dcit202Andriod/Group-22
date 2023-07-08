package com.example.recipe_guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        TextView textViewWelcome = findViewById(R.id.textViewWelcome);
        TextView textViewUsername = findViewById(R.id.texttitle);

        // Retrieve the username from the intent extras
        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");

        // Concatenate the welcome message with the username
        String welcomeMessage = "Welcome " + username;

        // Display the welcome message and username in the TextViews
        textViewWelcome.setText(welcomeMessage);
        //textViewUsername.setText(username);

        Button button = findViewById(R.id.nextbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page2.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
