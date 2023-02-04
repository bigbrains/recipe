package com.universeofaircraft.recipe.service.impl;

import java.util.List;

import com.universeofaircraft.recipe.entities.Product;
import com.universeofaircraft.recipe.repositories.ProductRepository;
import com.universeofaircraft.recipe.services.ProductService;

public class ProductServiceImpl implements ProductService {
	private ProductRepository productRepository;
	public ProductServiceImpl(ProductRepository productRepository) {
		
	}
	@Override
	public Product findById(Long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product save(Product entity) {
		return productRepository.save(entity);
	}

	@Override
	public List<Product> saveAll(List<Product> entities) {
		return productRepository.saveAll(entities);
	}

}
