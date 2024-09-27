package com.bumsoap.taco_client.service;

import com.bumsoap.taco_client.data.Ingredient;
import lombok.NoArgsConstructor;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@NoArgsConstructor
public class RestIngredientService implements IngredientService {

    private RestTemplate restTemplate;

    @Override
    public Iterable<Ingredient> findAll() {
        return Arrays.asList(restTemplate.getForObject(
                "http://localhost:8080/api/ingredients",
                Ingredient[].class));
    }

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        return restTemplate.postForObject(
                "http://localhost:8080/api/ingredients",
                ingredient,
                Ingredient.class);
    }

}