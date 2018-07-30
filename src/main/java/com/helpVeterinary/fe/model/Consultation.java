package com.helpVeterinary.fe.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class Consultation {
	private Long id;
	private Profesional profesional;
	private LocalDateTime datetime;
	private String diagnostic;
	private String observations;
	private String toDo;
	private LocalDate nextVisit;
	private ConsultationState state;
	private Animal animal;
	private UserSucursal userSucursal;
	
	
}
