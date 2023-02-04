package com.universeofaircraft.recipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universeofaircraft.recipe.entities.Dish;

public interface DishRepository extends JpaRepository<Dish, Long> {

}
