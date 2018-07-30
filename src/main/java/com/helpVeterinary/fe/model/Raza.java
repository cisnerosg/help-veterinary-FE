package com.helpVeterinary.fe.model;

import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class Raza {
	private Long id;
	private String description;
	
	public Raza(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	
}
