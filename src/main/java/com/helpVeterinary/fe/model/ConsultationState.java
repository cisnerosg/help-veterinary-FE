package com.helpVeterinary.fe.model;

import lombok.Getter;

public enum ConsultationState {
	ACTIVE("Activo"),
	DELETE("Borrado"),
	DRAFT("Borrador");
		
	private ConsultationState(String description) {
		this.description = description;
	}

	private @Getter String description;
	
}
