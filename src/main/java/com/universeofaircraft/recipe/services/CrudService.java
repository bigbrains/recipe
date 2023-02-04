package com.universeofaircraft.recipe.services;

import java.util.List;

public interface CrudService<T, ID> {
	public T findById(ID id);
	public List<T> findAll();
	public T save(T entity);
	public List<T> saveAll(List<T> entities);
}
