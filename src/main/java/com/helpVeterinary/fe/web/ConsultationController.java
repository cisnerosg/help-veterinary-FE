package com.helpVeterinary.fe.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsultationController {

    @GetMapping("/consultation")
    public String root() {
        return "vet/consultation";
    }

    @GetMapping("/consultations")
    public String userIndex() {
        return "vet/consultations";
    }


}
