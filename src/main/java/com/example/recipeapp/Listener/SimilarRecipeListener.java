package com.example.recipeapp.Listener;

import com.example.recipeapp.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipeListener {
    void didFetch(List<SimilarRecipeResponse> responses, String message);
    void didError(String message);
}
