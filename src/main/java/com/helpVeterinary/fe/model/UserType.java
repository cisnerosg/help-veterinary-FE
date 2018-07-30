package com.helpVeterinary.fe.model;

import lombok.Getter;

public enum UserType {
	VETERINARY("Veterinaria"),
	PARTICULAR("particular");
		
	private UserType(String description) {
		this.description = description;
	}

	private @Getter String description;
	
}
