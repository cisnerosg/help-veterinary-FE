package com.helpVeterinary.fe.model;

import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class Particular {
	private Long id;
	private Long userId;
	private OwnerAnimal owner;
		
}
