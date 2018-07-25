package com.helpVeterinary.model;

import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class User {
	private String username;
	private String password;
	private String[] roles;

	
	 public User(String username, String password, String... roles) {
	    this.username = username;
	    this.password = password;
	    this.roles = roles;
	 }
}
