package com.universeofaircraft.recipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universeofaircraft.recipe.entities.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}
