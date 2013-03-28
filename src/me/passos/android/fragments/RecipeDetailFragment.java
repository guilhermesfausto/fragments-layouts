package me.passos.android.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecipeDetailFragment extends Fragment {

    private Recipe recipe;
    private TextView recipeName;

    public RecipeDetailFragment(Recipe recipe) {
        this.recipe = recipe;
    }

    public RecipeDetailFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recipe_detail, null);
        recipeName = (TextView) view.findViewById(R.id.recipe_name);
        if( recipe != null ) {
            recipeName.setText(recipe.getName());
        }
        return view;
    }

    public void displayRecipe(Recipe recipe) {
        recipeName.setText(recipe.getName());
    }
}
