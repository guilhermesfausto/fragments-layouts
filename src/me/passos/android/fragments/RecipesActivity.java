package me.passos.android.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class RecipesActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipes);

        if( isTable() ) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.recipe_list, new RecipeListFragment());
            fragmentTransaction.replace(R.id.recipe_detail, new RecipeDetailFragment(), "detail");
            fragmentTransaction.commit();
        } else {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.recipes, new RecipeListFragment());
            fragmentTransaction.commit();
        }


    }

    private boolean isTable() {
        return getResources().getBoolean(R.bool.isTable);
    }

    public void showRecipe(Recipe recipe) {
        if( isTable() ) {
            RecipeDetailFragment detailFragment = (RecipeDetailFragment) getSupportFragmentManager().findFragmentByTag("detail");
            detailFragment.displayRecipe(recipe);
        } else {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.recipes, new RecipeDetailFragment(recipe));
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
