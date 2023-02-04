package com.universeofaircraft.recipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universeofaircraft.recipe.entities.Tool;

public interface ToolRepository extends JpaRepository<Tool, Long> {

}
