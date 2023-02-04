package com.universeofaircraft.recipe.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue
	@Column(name = "id")
	Long id;
	@Column(name = "name")
	String text;
	@Column(name = "photo")
	String photo;
	@Column(name = "unit")
	String unit;
}
