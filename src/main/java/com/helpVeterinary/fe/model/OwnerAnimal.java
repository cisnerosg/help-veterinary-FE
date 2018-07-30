package com.helpVeterinary.fe.model;

import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class OwnerAnimal {
	private Long id;
	private String lastName;
	private String firstName;
	private String phone;
	private String celular;
	
	public OwnerAnimal(Long id, String lastName, String firstName, String phone, String celular) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
		this.celular = celular;
	}
	
	
	
}
