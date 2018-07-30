package com.helpVeterinary.fe.model;

import lombok.Getter;

public enum AnimalType {
	DOG("perro"),
	CAT("gato"),
	FISH("pez");
		
	private AnimalType(String description) {
		this.description = description;
	}

	private @Getter String description;
	
}
