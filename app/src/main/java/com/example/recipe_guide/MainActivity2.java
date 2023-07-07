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
                "1 ½ cups water(360 mL)", "Instructions\n"+ "Add onions and 2 tablespoons of oil to a blender and pulse until smooth.\n"+" Transfer to a medium bowl.\n" + "Add the diced tomatoes, tomato paste, and habanero pepper to the blender, and pulse until smooth.\n"+ " Transfer to a separate medium bowl.\n" + "Heat the remaining ⅓ cup (80 ml) of oil in a large, heavy-bottomed pot over medium heat.\n"+ "Once the oil is shimmering, add the onion puree and cook until the water has cooked out and the puree is starting to brown, about 10 minutes.\n" + "Stir in the tomato puree and add the curry powder, garlic powder, ginger, dried herbs, and crushed bouillon cubes. Cook for 20-30 minutes, stirring occasionally, until the stew has reduced by half and is deep red in color.\n" + "Add the rice, mixed vegetables, and water.\n"+ " Bring to a boil, then reduce the heat to low and cover the pot with foil and a lid.\n"+ " Simmer for another 30 minutes, until the rice is cooked through and the liquid is absorbed.\n"+ "Enjoy!"));
        recipeStorage.addRecipe(new Recipe("Fried Rice", "Ingredients \n" +"1 1/2 c. long-grain rice (preferably jasmine), or about 2 1/2 c. leftover rice\n" +
                "3 tbsp. peanut or vegetable oil, divided\n" +
                "3 large eggs, beaten to blend\n" +
                "5 cloves garlic, grated or finely chopped\n" +
                "1 (1\") piece ginger, peeled, grated or finely chopped\n" +
                "4 scallions, white, pale green, and dark green parts separated, thinly sliced\n" +
                "2 tbsp. reduced-sodium soy sauce\n" +
                "1 tsp. granulated sugar\n" +
                "1 tsp. kosher salt\n" +
                "1/2 tsp. white pepper\n" +
                "1/4 tsp. MSG\n" +
                "1/3 c. frozen peas\n" +
                "1 tbsp. unsalted butter, cut into pieces", "Instructions \n" + "Step 1\n" +
                "Fill a large pot about halfway with water and bring to a boil. Meanwhile, thoroughly rinse rice in a strainer until water runs almost clear.\n" +
                "Step 2\n" +
                "Cook rice in boiling water 3 minutes, then drain with a fine-mesh strainer that fits in pot. Wipe out pot, pour in about 2 pints water, and bring to a simmer. With rice in strainer, make a few divots in rice through to bottom of strainer with a chopstick or butter knife.\n" +
                "Step 3\n" +
                "Cover strainer with foil, then place in pot over simmering water. Place pot lid over strainer; if there’s a lot of steam escaping, wrap foil or a damp tea towel around rim of pot and strainer. (This can also be done in a bamboo steamer or a standard steaming setup that won’t let the rice fall through.)\n" +
                "Step 4\n" +
                "Steam until rice is cooked through but still slightly al dente, about 15 minutes; it should have a drier feel than normal steamed rice. Spread onto a baking sheet and let cool to room temperature. Refrigerate until ready to use.\n" +
                "Step 5\n" +
                "Heat a large wok or well-seasoned cast-iron skillet over high heat. Pour in 1 tablespoon oil and swirl wok to coat. Once oil is shimmering, add eggs and cook, breaking up into small pieces, until cooked through but not browning, about 1 minute. Transfer to a plate. Wipe out wok.\n" +
                "Step 6\n" +
                "In same wok over high heat, swirl remaining 2 tablespoons oil. Cook garlic and ginger, tossing constantly, until fragrant and garlic begins to brown, about 30 seconds. Add white and pale green scallion parts and cook, tossing constantly, until softened, about 1 minute. Add rice and immediately toss to combine. Fry rice, stirring constantly, until no clumps remain and you begin to hear some light popping sounds from the rice toasting, 2 to 3 minutes.\n" +
                "Step 7\n" +
                "Add soy sauce, granulated sugar, salt, pepper, and MSG and cook, tossing constantly, until soy sauce is absorbed, about 1 minute. Add eggs, peas, and dark green scallion parts and cook, tossing constantly, until warmed through and incorporated, about 2 minutes more. Add butter and cook, tossing, until melted, about 30 seconds more. "));

        recipeStorage.addRecipe(new Recipe("Pancake", "Ingredients\n"+"1 cup all-purpose flour, (spooned and leveled)\n" +
                "\n" +
                "2 tablespoons sugar\n" +
                "\n" +
                "2 teaspoons baking powder\n" +
                "\n" +
                "½ teaspoon salt\n" +
                "\n" +
                "1 cup milk\n" +
                "\n" +
                "2 tablespoons unsalted butter, melted, or vegetable oil\n" +
                "\n" +
                "1 large egg\n" +
                "\n" +
                "1 tablespoon vegetable oil\n" +
                "\n" +
                "Assorted toppings, such as butter, maple syrup, confectioners' sugar, honey, jams, preserves, sweetened whipped cream, or chocolate syrup", "Instructions\n"+"Step 1\n"+"Gather ingredients and preheat oven:\n" +
                "Preheat oven to 200 degrees. Have a baking sheet or heatproof platter ready to keep cooked pancakes warm in the oven.\n"+ "Step 2" + "Mix dry ingredients:\n" +
                "In a small bowl, whisk together flour, sugar, baking powder, and salt; set aside.\n"+" Step 3\n"+"Mix wet ingredients: " +
                "In a medium bowl, whisk together milk, butter (or oil), and egg.\n"+"Step 4" + "Combine wet and dry ingredients:\n" +
                "Add dry ingredients to milk mixture; whisk until just moistened. (Do not overmix; a few small lumps are fine.)" + "Step 5\n" +" Heat and oil skillet or griddle:\n" +
                "Heat a large skillet (nonstick or cast-iron) or griddle over medium. Fold a sheet of paper towel in half, and moisten with oil; carefully rub skillet with oiled paper towel." + "Step 6\n" +"Spoon batter onto skillet or griddle:\n" +
                "For each pancake, spoon 2 to 3 tablespoons of batter onto skillet, using the back of the spoon to spread batter into a round (you should be able to fit 2 to 3 in a large skillet)."+ "Step 7" +"Cook first side:\n" +
                "Cook until surface of pancakes have some bubbles and a few have burst, 1 to 2 minutes." + "Step 8\n" + "Flip pancakes:\n" +
                "Flip carefully with a thin spatula, and cook until browned on the underside, 1 to 2 minutes more." + "Step 9\n" + "Serve immediately, or keep warm in oven:\n" +
                "Transfer to a baking sheet or platter; cover loosely with aluminum foil, and keep warm in oven. Continue with more oil and remaining batter. (You'll have 12 to 15 pancakes.) Serve warm, with desired toppings." ));

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
