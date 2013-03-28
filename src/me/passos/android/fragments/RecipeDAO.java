package me.passos.android.fragments;

import java.util.ArrayList;
import java.util.List;

public class RecipeDAO {

    public static List<Recipe> getAll() {

        List<Recipe> recipes = new ArrayList<Recipe>();

        Recipe recipe1 = new Recipe();
        recipe1.setName("Cupcake");
        recipes.add(recipe1);

        Recipe recipe2 = new Recipe();
        recipe2.setName("Donut");
        recipes.add(recipe2);

        Recipe recipe3 = new Recipe();
        recipe3.setName("Eclair");
        recipes.add(recipe3);

        Recipe recipe4 = new Recipe();
        recipe4.setName("FroYo");
        recipes.add(recipe4);

        Recipe recipe5 = new Recipe();
        recipe5.setName("Gingerbread");
        recipes.add(recipe5);

        Recipe recipe6 = new Recipe();
        recipe6.setName("Honeycomb");
        recipes.add(recipe6);

        Recipe recipe7 = new Recipe();
        recipe7.setName("Ice Cream Sandwich");
        recipes.add(recipe7);

        Recipe recipe8 = new Recipe();
        recipe8.setName("Jelly Bean");
        recipes.add(recipe8);

        return recipes;

    }

}
