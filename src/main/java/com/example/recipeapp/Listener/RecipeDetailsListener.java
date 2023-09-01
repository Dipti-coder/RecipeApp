package com.example.recipeapp.Listener;

import com.example.recipeapp.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void deiFetch(RecipeDetailsResponse response,String message);
    void didError(String message);
}
