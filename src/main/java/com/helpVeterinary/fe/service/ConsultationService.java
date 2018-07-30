package com.helpVeterinary.fe.service;

import java.util.List;

import com.helpVeterinary.fe.model.Consultation;

public interface ConsultationService{

	public void saveConsultation(Consultation consultation);
	
	public List<Consultation> getConsultations();
	
	public Consultation getConsultation(Long id);
	
}
