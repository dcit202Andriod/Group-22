package com.example.recipe_guide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class RecipeDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);

        // Retrieve the selected recipe from the intent
        Intent intent = getIntent();
        Recipe selectedRecipe = intent.getParcelableExtra("recipe");

        // Display the recipe details in the UI

        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewIngredients = findViewById(R.id.textViewIngredients);
        TextView textViewInstructions = findViewById(R.id.textViewInstructions);


        textViewName.setText(selectedRecipe.getName());
        textViewIngredients.setText(selectedRecipe.getIngredients());
        textViewInstructions.setText(selectedRecipe.getInstructions());
    }
}

