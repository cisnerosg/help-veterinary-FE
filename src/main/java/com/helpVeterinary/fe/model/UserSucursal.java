package com.helpVeterinary.fe.model;

import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class UserSucursal {
	private Long id;
	private Long userId;
	private Sucursal sucursal;
		
}
