package com.helpVeterinary.fe.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.helpVeterinary.fe.model.Consultation;
import com.helpVeterinary.fe.service.ConsultationService;

@Controller
public class ConsultationController {

	private ConsultationService consultationService;
	
	@Autowired
    public ConsultationController(ConsultationService consultationService) {
		this.consultationService = consultationService;
	}

	@GetMapping("/consultation")
    public String consultation(Model model) {
		Consultation consultation = new Consultation();		
		model.addAttribute("consultation", consultation);
		
        return "vet/consultation";
    }

    @GetMapping("/consultations")
    public String consultations(Model model) {
    	List<Consultation> elements = consultationService.getConsultations();
    	model.addAttribute("elements", elements);
    	
        return "vet/consultations";
    }
    
    @RequestMapping(path = "consultation", method = RequestMethod.POST)
    public String saveConsultation(Model model,Consultation consultation) {
    	consultationService.saveConsultation(consultation);
		
    	return "index";
	}
    
    


}
