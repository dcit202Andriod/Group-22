package com.example.recipe_guide;

import java.util.ArrayList;
import java.util.List;

public class RecipeStorage {
    private List<Recipe> recipeList;

    public RecipeStorage() {
        recipeList = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
    }

    public Recipe getRecipe(int index) {
        return recipeList.get(index);
    }

    public List<Recipe> getAllRecipes() {
        return recipeList;
    }
}


