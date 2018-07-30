package com.helpVeterinary.fe.model;


import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class User {
	private Long id;
	private String username;
	private String password;
	private Rol rol;
	private UserType type;
	
	public User(String username, String password,Rol rol) {
		super();
		this.username = username;
		this.password = password;
		this.rol = rol;
	}

	
}
