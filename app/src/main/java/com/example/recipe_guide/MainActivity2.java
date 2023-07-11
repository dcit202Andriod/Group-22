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
                "Add dry ingredients to milk mixture; whisk until just moistened. (Do not overmix; a few small lumps are fine.)\n" + "Step 5\n" +" Heat and oil skillet or griddle:\n" +
                "Heat a large skillet (nonstick or cast-iron) or griddle over medium. Fold a sheet of paper towel in half, and moisten with oil; carefully rub skillet with oiled paper towel.\n" + "Step 6\n" +"Spoon batter onto skillet or griddle:\n" +
                "For each pancake, spoon 2 to 3 tablespoons of batter onto skillet, using the back of the spoon to spread batter into a round (you should be able to fit 2 to 3 in a large skillet).\n"+ "Step 7" +"Cook first side:\n" +
                "Cook until surface of pancakes have some bubbles and a few have burst, 1 to 2 minutes.\n" + "Step 8\n" + "Flip pancakes:\n" +
                "Flip carefully with a thin spatula, and cook until browned on the underside, 1 to 2 minutes more.\n" + "Step 9\n" + "Serve immediately, or keep warm in oven:\n" +
                "Transfer to a baking sheet or platter; cover loosely with aluminum foil, and keep warm in oven. Continue with more oil and remaining batter. (You'll have 12 to 15 pancakes.) Serve warm, with desired toppings." ));
        recipeStorage.addRecipe(new Recipe("Spaghetti Carbonara", "Ingredients:\n"+"1 package (16 ounces) spaghetti\n" +
                "2 large eggs, room temperature\n" +
                "1 cup grated Parmesan cheese\n" +
                "1 tablespoon olive oil\n" +
                "4 ounces chopped pancetta\n" +
                "2 garlic cloves, minced\n" +
                "1/4 teaspoon salt\n" +
                "1/4 teaspoon freshly ground pepper\n" +
                "Chopped fresh parsley", "instructiions:\n" +"Step 1: Cook spaghetti according to package directions for al dente. Meanwhile, in a large bowl, whisk eggs and Parmesan; set aside.\n" +
                "Step 2: In a large skillet, heat oil over medium heat. Add pancetta; cook and stir until crispy, 5-6 minutes. Add garlic; cook 1 minute longer.\n" +
                "Step 3: Drain spaghetti, reserving 3/4 cup pasta water. Add spaghetti to skillet; toss to coat. Slowly add egg mixture, stirring constantly. Add salt, pepper and enough reserved pasta water for sauce to reach desired consistency. Sprinkle with parsley and if desired, additional Parmesan.\n"
        ));
        recipeStorage.addRecipe(new Recipe("French Onion Soup", "Ingredients:\n"+"2 cups dry white wine\n" +
                "2-3 tablespoons olive oil\n" +
                "2 white onions, sliced\n" +
                "1/2 teaspoon Kosher salt\n" +
                "Freshly ground black pepper, to taste\n" +
                "2-3 tablespoons olive oil\n" +
                "6 medium yellow or red potatoes, sliced in 1/2-in. rounds\n" +
                "2 teaspoons of beef bouillon paste\n" +
                "1 tablespoon kosher salt\n" +
                "1 tablespoon fresh thyme\n" +
                "1 tablespoon fresh rosemary, roughly chopped\n" +
                "1-1/2 cups Gruyere cheese, shredded\n" +
                "Fresh chives, chopped\n" +
                "Flaky salt, to taste", "instructiions:\n"+ "Step 1: Caramelize the onions\n" +
                "Place the onions in a large skillet and pour in the wine. Cook on medium-high heat until the liquid evaporates, about 30 minutes. Then add two to three tablespoons of oil along with the salt and pepper. Cook on low for at least one hour to caramelize, stirring occasionally.\n" +
                "Step 2: Prepare the potatoes\n" +
                "Preheat the oven to 450°F. Pour the remaining two to three tablespoons of oil onto a half sheet pan and place in the oven to heat it up. In the meantime, fill a pot with water, stirring in the bouillon paste and kosher salt. Add the potatoes. Cook over high heat until the potatoes are soft enough that a fork can pierce through, but the potatoes don’t fall apart, about 20 minutes. Drain the potatoes.\n" +
                "Step 3: Roast the potatoes and add the sliced potatoes to the preheated sheet pan in a single layer. Season with salt, thyme and rosemary. Roast until golden brown, for 20-30 minutes, flipping the potatoes halfway through.\n" +
                "Step 4: Add caramelized onions and cheese. Top each potato round with caramelized onions and cheese. Return the pan to the oven to cook until the cheese is melted, about three to five minutes. Garnish with fresh chives and flaky salt.\n" ));
        recipeStorage.addRecipe(new Recipe("Tortellini Soup", "Ingredients:\n"+ "2 tablespoons olive oil\n" +
                "3 medium carrots, chopped\n" +
                "1 large onion, chopped\n" +
                "4 garlic cloves, minced\n" +
                "1/4 cup all-purpose flour\n" +
                "1/2 cup dry white wine\n" +
                "2 cans (14-1/2 ounces each) vegetable broth\n" +
                "1 package (9 ounces) refrigerated cheese tortellini\n" +
                "1 teaspoon Italian seasoning\n" +
                "3/4 teaspoon salt\n" +
                "1/2 teaspoon pepper\n" +
                "Crushed red pepper flakes, optional\n" +
                "1 cup heavy whipping cream\n" +
                "4 cups chopped fresh spinach\n" +
                "Grated Parmesan cheese, optional", "instructiions:\n"+"Step 1: Cook the aromatics.In a Dutch oven, heat oil over medium heat. Add carrots and onion, stirring until crisp-tender, six to eight minutes. Add garlic, cook and stir for one minute longer.\n" +
                "Step 2: Let the wine reduce.Stir in the flour until blended, and then add the white wine. Increase the heat and cook, stirring occasionally until wine is reduced by half, two to three minutes. Gradually whisk in the broth. Bring to a boil, stirring constantly. Cook and stir until slightly thickened, three to five minutes.\n" +
                "Step 3: Add tortellini.Add the tortellini, Italian seasoning, salt, pepper and, if desired, crushed red pepper flakes. Reduce the heat and cook, uncovered, just until tortellini are tender, three to five minutes. Add the cream and spinach, cook and stir until spinach is wilted, one to two minutes longer.\n" +
                "Step 4: Garnish and serve\n" +
                "If desired, serve with grated Parmesan cheese and top with additional crushed red pepper flakes.\n" +
                "" ));
        recipeStorage.addRecipe(new Recipe("Forgotten Jambalaya", "Ingredients:\n"+"1 can (14-1/2 ounces) diced tomatoes, undrained\n" +
                "1 can (14-1/2 ounces) beef or chicken broth\n" +
                "1 can (6 ounces) tomato paste\n" +
                "3 celery ribs, chopped\n" +
                "2 medium green peppers, chopped\n" +
                "1 medium onion, chopped\n" +
                "5 garlic cloves, minced\n" +
                "3 teaspoons dried parsley flakes\n" +
                "2 teaspoons dried basil\n" +
                "1-1/2 teaspoons dried oregano\n" +
                "1-1/4 teaspoons salt\n" +
                "1/2 teaspoon cayenne pepper\n" +
                "1/2 teaspoon hot pepper sauce\n" +
                "1 pound boneless skinless chicken breasts, cut into 1-inch cubes\n" +
                "1 pound smoked sausage, halved and cut into 1/4-inch slices\n" +
                "1/2 pound uncooked shrimp (31-40 per pound), peeled and deveined\n" +
                "Hot cooked rice", "instructiions:\n"+"Step 1: In a 5-qt. slow cooker, combine the tomatoes, broth and tomato paste. Stir in the celery, green peppers, onion, garlic, seasonings and pepper sauce. Stir in chicken and sausage.\n" +
                "Step 2: Cover and cook on low for 4-6 hours or until chicken is no longer pink. Stir in shrimp. Cover and cook 15-30 minutes longer or until shrimp turn pink. Serve with rice.\n" +
                "\n" +
                "" ));
        recipeStorage.addRecipe(new Recipe("Rice-Stuffed Peppers", "Ingredients:\n"+ "2 pounds ground beef\n" +
                "1 medium onion, chopped\n" +
                "1 small green pepper, chopped\n" +
                "2 garlic cloves, minced\n" +
                "1 teaspoon salt\n" +
                "1/2 teaspoon pepper\n" +
                "3-3/4 cups water\n" +
                "1 can (14-1/2 ounces) diced tomatoes, undrained\n" +
                "1 can (10 ounces) diced tomatoes with mild green chiles, undrained\n" +
                "1 can (15 ounces) tomato sauce\n" +
                "1 tablespoon ground cumin\n" +
                "3 cups uncooked instant rice\n" +
                "4 medium green peppers\n" +
                "CHEESE SAUCE:\n" +
                "1-1/2 pounds Velveeta, cubed\n" +
                "1 can (10 ounces) diced tomatoes with mild green chiles", "instructiions:\n"+"Step 1: In a Dutch oven, cook beef, onion, chopped green pepper, garlic, salt and pepper over medium heat until beef is no longer pink; drain. Add the water, tomatoes, tomato sauce and cumin. Bring to a boil. Reduce heat; simmer, uncovered, for 10 minutes.\n" +
                "Step 2: Stir in rice; simmer, uncovered, for 5 minutes. Remove from the heat; cover and let stand for 5 minutes.\n" +
                "Step 3: Remove tops and seeds from the peppers; cut in half widthwise. Place in a large pan of boiling water; boil for 4 minutes.\n" +
                "Step 4: Drain peppers and stuff with meat mixture. Place remaining meat mixture in an ungreased 13x9-in. baking dish; top with stuffed peppers, pressing down gently. Cover and bake at 350° for 30 minutes. In a saucepan, heat sauce ingredients until cheese is melted. Serve over peppers.\n" +
                "" ));
        recipeStorage.addRecipe(new Recipe("Wild Rice Soup", "Ingredients:\n"+"1/3 cup uncooked wild rice\n" +
                "1 tablespoon canola oil\n" +
                "1 quart water\n" +
                "1 medium onion, chopped\n" +
                "1 celery rib, finely chopped\n" +
                "1 medium carrot, finely chopped\n" +
                "1/2 cup butter\n" +
                "1/2 cup all-purpose flour\n" +
                "3 cups chicken broth\n" +
                "2 cups half-and-half cream\n" +
                "1/2 teaspoon dried rosemary, crushed\n" +
                "1 teaspoon salt", "instructiions:\n"+ "Step 1: In a medium saucepan, combine the rice, oil and water; bring to a boil. Reduce heat; cover and simmer for 30 minutes.\n" +
                "Step 2: in a Dutch oven, cook the onion, celery and carrot in butter until vegetables are almost tender. Stir in flour until blended; cook and stir for 2 minutes. Slowly stir in broth and undrained rice. Bring to a boil; cook and stir until slightly thickened, 2 minutes. Reduce heat; stir in the cream, rosemary and salt. Simmer, uncovered, until rice is tender, about 20 minutes.\n" +
                "\n" +
                "" ));
        recipeStorage.addRecipe(new Recipe("Chicken & Wild Rice Strudels", "Ingredients:\n"+"1 package (8.8 ounces) ready-to-serve long grain and wild rice\n" +
                "1-1/2 cups coarsely chopped rotisserie chicken\n" +
                "1/2 cup shredded Swiss cheese\n" +
                "1/2 teaspoon Italian seasoning\n" +
                "1/4 teaspoon salt\n" +
                "1/4 teaspoon pepper\n" +
                "12 sheets phyllo dough (14x9-inch size)\n" +
                "6 tablespoons butter, melted", "instructiions:\n"+"Step 1: Preheat oven to 400°. Place the first 6 ingredients in a large bowl; toss to combine.\n" +
                "Step 2: Place 1 sheet of phyllo dough on a work surface; brush lightly with melted butter. Layer with 5 additional sheets, brushing each layer. (Keep remaining phyllo covered with a damp towel to prevent it from drying out.)\n" +
                "Step 3: Spoon half the rice mixture down the center of the phyllo dough to within 1 in. of ends. Fold up short sides to enclose filling. Roll up tightly, starting with a long side.\n" +
                "Step 4: Transfer to a parchment-lined 15x10x1-in. baking pan, seam side down. Brush with additional butter. Repeat with remaining ingredients. Bake 20-25 minutes or until golden brown and heated through.\n" +
                "" ));
        recipeStorage.addRecipe(new Recipe("Lemony Turkey Rice Soup", "Ingredients:\n"+"2 cups diced cooked turkey\n" +
                "2 cups cooked long grain rice\n" +
                "1 can (10-1/2 ounces) condensed cream of chicken soup, undiluted\n" +
                "1/4 teaspoon pepper\n" +
                "6 cups chicken broth, divided\n" +
                "2 tablespoons cornstarch\n" +
                "1/4 to 1/3 cup lemon juice\n" +
                "1/4 to 1/2 cup minced fresh cilantro", "instructiions:\n"+"Step 1: In a large saucepan, combine first 4 ingredients and 5-1/2 cups broth. Bring to a boil; cook 3 minutes.\n" +
                "Step 2: In a small bowl, mix cornstarch and remaining broth until smooth; gradually stir into soup. Bring to a boil; cook and stir until thickened, 1-2 minutes. Remove from heat; stir in lemon juice and cilantro.\n" +
                "" ));
        recipeStorage.addRecipe(new Recipe("Mulligatawny Soup", "Ingredients:\n"+"½ cup chopped onion\n" +
                "2 stalks celery, chopped\n" +
                "1 carrot, diced\n" +
                "¼ cup butter\n" +
                "1 ½ tablespoons all-purpose flour\n" +
                "1 ½ teaspoons curry powder\n" +
                "4 cups chicken broth\n" +
                "½ apple, cored and chopped\n" +
                "¼ cup white rice\n" +
                "1 skinless, boneless chicken breast half - cut into cubes\n" +
                "1 pinch dried thyme\n" +
                "salt and ground black pepper to taste\n" +
                "½ cup heavy cream, heated\n", "instructiions:\n"+"Step 1: Melt butter in a large soup pot over medium heat. Add onions, celery, and carrot and sauté until soft, 5 to 7 minutes. Add flour and curry, and cook 5 more minutes, stirring frequently. Add chicken broth, mix well, and bring to a boil. Reduce heat and simmer for about 30 minutes.\n" +
                "Step 2: Add apple, rice, chicken, thyme, salt, and pepper. Simmer until rice is tender, 15 to 20 minutes.\n" +
                "Step 3: Just before serving, stir in hot cream." ));





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
