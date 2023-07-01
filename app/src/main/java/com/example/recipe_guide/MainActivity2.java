package com.example.recipe_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private RecipeStorage recipeStorage;
    private ListView listViewRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);


        recipeStorage = new RecipeStorage();
        recipeStorage.addRecipe(new Recipe("Ghanaian Jollof Rice", "Ingredients: for 6 servings\n" +
                "\n" +
                "2 large yellow onions, roughly chopped\n" +
                "⅓ cup vegetable oil(80 mL), plus 2 tablespoons, divided\n" +
                "14 oz diced tomato(395 g), 2 cans\n" +
                "6 oz tomato paste(170 g), 1 can\n" +
                "1 habanero pepper\n" +
                "2 teaspoons curry powder\n" +
                "1 teaspoon garlic powder\n" +
                "1 teaspoon ground ginger\n" +
                "½ teaspoon mixed dried herbs\n" +
                "3 chicken bouillon cubes, crushed\n" +
                "2 ½ cups long grain rice(500 g), rinsed\n" +
                "1 cup frozen mixed vegetable(150 g)\n" +
                "1 ½ cups water(360 mL)", "Instructtions\n"+ "Add onions and 2 tablespoons of oil to a blender and pulse until smooth.\n"+" Transfer to a medium bowl.\n" + "Add the diced tomatoes, tomato paste, and habanero pepper to the blender, and pulse until smooth.\n"+ " Transfer to a separate medium bowl.\n" + "Heat the remaining ⅓ cup (80 ml) of oil in a large, heavy-bottomed pot over medium heat.\n"+ "Once the oil is shimmering, add the onion puree and cook until the water has cooked out and the puree is starting to brown, about 10 minutes.\n" + "Stir in the tomato puree and add the curry powder, garlic powder, ginger, dried herbs, and crushed bouillon cubes. Cook for 20-30 minutes, stirring occasionally, until the stew has reduced by half and is deep red in color.\n" + "Add the rice, mixed vegetables, and water.\n"+ " Bring to a boil, then reduce the heat to low and cover the pot with foil and a lid.\n"+ " Simmer for another 30 minutes, until the rice is cooked through and the liquid is absorbed.\n"+ "Enjoy!"));
        recipeStorage.addRecipe(new Recipe("Recipe 2", "Ingredients for Recipe 2", "Instructions for Recipe 2"));


        listViewRecipes = findViewById(R.id.listViewRecipes);


        List<Recipe> recipes = recipeStorage.getAllRecipes();

        ArrayAdapter<Recipe> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, recipes);

        listViewRecipes.setAdapter(adapter);

        listViewRecipes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Recipe selectedRecipe = (Recipe) parent.getItemAtPosition(position);

                Intent intent = new Intent(MainActivity2.this, RecipeDetailsActivity.class);
                intent.putExtra("recipe", selectedRecipe);
                startActivity(intent);
            }
        });

        Button button = findViewById(R.id.settingsbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, settings.class);
                startActivity(intent);
            }
        });

    }
}
