package com.helpVeterinary.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HealthController {
	
	@GetMapping(path = "/health")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> health() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
