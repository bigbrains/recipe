package com.universeofaircraft.recipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universeofaircraft.recipe.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
