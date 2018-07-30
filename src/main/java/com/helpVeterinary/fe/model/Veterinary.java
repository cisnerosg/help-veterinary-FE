package com.helpVeterinary.fe.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class Veterinary {
	private Long id;
	private Long userId;
	private List<Sucursal> sucursales;
		
}
