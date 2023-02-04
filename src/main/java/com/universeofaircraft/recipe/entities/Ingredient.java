package com.universeofaircraft.recipe.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ingredients")
public class Ingredient {
	@Id
	@GeneratedValue
	@Column(name = "id")
	Long id;
	@ManyToOne
    @JoinColumn(name = "product_id")
	Product product;
	@Column(name = "count")
	Float count;
	@ManyToOne
	@JoinColumn(name = "dish_id")
	Dish dish;
}
