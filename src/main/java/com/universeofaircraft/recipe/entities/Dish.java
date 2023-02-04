package com.universeofaircraft.recipe.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "dishes")
public class Dish {
	@Id
	@GeneratedValue
	@Column(name = "id")
	Long id;
	@Column(name = "name")
	String name;
	@Column(name = "photo")
	String photo;
	
	@ManyToMany
	@JoinTable(
	  name = "dishes_tools", 
	  joinColumns = @JoinColumn(name = "dish_id"), 
	  inverseJoinColumns = @JoinColumn(name = "tool_id"))
	List<Tool> tools;
}
