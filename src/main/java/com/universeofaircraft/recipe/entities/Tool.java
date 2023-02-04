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
@Table(name = "tools")
public class Tool {
	@Id
	@GeneratedValue
	@Column(name = "id")
	Long id;
	@Column(name = "name")
	String name;
	@Column(name = "photo")
	String photo;
}
