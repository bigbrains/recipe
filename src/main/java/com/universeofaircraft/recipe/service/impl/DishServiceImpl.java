package com.universeofaircraft.recipe.service.impl;

import java.util.List;

import com.universeofaircraft.recipe.entities.Dish;
import com.universeofaircraft.recipe.repositories.DishRepository;
import com.universeofaircraft.recipe.services.DishService;

public class DishServiceImpl implements DishService {
	private DishRepository dishRepository;
	
	public DishServiceImpl(DishRepository dishRepository) {
		this.dishRepository = dishRepository;
	}
	@Override
	public Dish findById(Long id) {
		return dishRepository.findById(id).get();
	}

	@Override
	public List<Dish> findAll() {
		return dishRepository.findAll();
	}

	@Override
	public Dish save(Dish entity) {
		return dishRepository.save(entity);
	}

	@Override
	public List<Dish> saveAll(List<Dish> entities) {
		return dishRepository.saveAll(entities);
	}

}
