package com.example.recipe_guide;

import android.os.Parcel;
import android.os.Parcelable;

public class Recipe implements Parcelable {
    private String name;
    private String ingredients;
    private String instructions;

    public Recipe(String name, String ingredients, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    protected Recipe(Parcel in) {
        name = in.readString();
        ingredients = in.readString();
        instructions = in.readString();
    }

    public static final Creator<Recipe> CREATOR = new Creator<Recipe>() {
        @Override
        public Recipe createFromParcel(Parcel in) {
            return new Recipe(in);
        }

        @Override
        public Recipe[] newArray(int size) {
            return new Recipe[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(ingredients);
        dest.writeString(instructions);
    }
}

