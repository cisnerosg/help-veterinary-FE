package com.helpVeterinary.fe.model;

import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class Sucursal {
	private Long id;
	private Veterinary veterinary;
	private String description;
	private Ubication ubication;
		
}
