package com.universeofaircraft.recipe.service.impl;

import java.util.List;

import com.universeofaircraft.recipe.entities.Tool;
import com.universeofaircraft.recipe.services.ToolService;

public class ToolServiceImpl implements ToolService {
	private ToolService toolService;
	
	public ToolServiceImpl(ToolService toolService) {
		this.toolService = toolService;
	}
	@Override
	public Tool findById(Long id) {
		return toolService.findById(id);
	}

	@Override
	public List<Tool> findAll() {
		return toolService.findAll();
	}

	@Override
	public Tool save(Tool entity) {
		return toolService.save(entity);
	}

	@Override
	public List<Tool> saveAll(List<Tool> entities) {
		return toolService.saveAll(entities);
	}

}
