package com.helpVeterinary.fe.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class Animal {
	private Long id;
	private String name;
	private LocalDate birthdate;
	private boolean isBirthdateAprox;
	private Raza raza;
	private String color;
	private BigDecimal weight;
	private OwnerAnimal owner;
	private AnimalType type;
	private String typeObservations;
	
	public Animal(Long id, String name, LocalDate birthdate, boolean isBirthdateAprox, Raza raza, String color,
			BigDecimal weight, OwnerAnimal owner, AnimalType type, String typeObservations) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.isBirthdateAprox = isBirthdateAprox;
		this.raza = raza;
		this.color = color;
		this.weight = weight;
		this.owner = owner;
		this.type = type;
		this.typeObservations = typeObservations;
	}

	
}
