package com.helpVeterinary.fe.model;

import lombok.Getter;

public enum Rol {
	ADMIN("Administrador"),
	COLABORATOR("Colaborador");
		
	private Rol(String description) {
		this.description = description;
	}

	private @Getter String description;
	
}
