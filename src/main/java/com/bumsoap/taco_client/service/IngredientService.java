package com.bumsoap.taco_client.service;

import com.bumsoap.taco_client.data.Ingredient;

public interface IngredientService {
    Iterable<Ingredient> findAll();

    Ingredient addIngredient(Ingredient ingredient);
}
