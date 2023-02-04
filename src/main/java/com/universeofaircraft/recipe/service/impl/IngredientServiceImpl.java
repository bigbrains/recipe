package com.universeofaircraft.recipe.service.impl;

import java.util.List;

import com.universeofaircraft.recipe.entities.Ingredient;
import com.universeofaircraft.recipe.repositories.IngredientRepository;
import com.universeofaircraft.recipe.services.IngredientService;

public class IngredientServiceImpl implements IngredientService {
	private IngredientRepository ingredientRepository;

	public IngredientServiceImpl(IngredientRepository ingredientRepository) {
		this.ingredientRepository = ingredientRepository;
	}

	@Override
	public Ingredient findById(Long id) {
		return ingredientRepository.findById(id).get();
	}

	@Override
	public List<Ingredient> findAll() {
		return ingredientRepository.findAll();
	}

	@Override
	public Ingredient save(Ingredient entity) {
		return ingredientRepository.save(entity);
	}

	@Override
	public List<Ingredient> saveAll(List<Ingredient> entities) {
		return ingredientRepository.saveAll(entities);
	}

}
