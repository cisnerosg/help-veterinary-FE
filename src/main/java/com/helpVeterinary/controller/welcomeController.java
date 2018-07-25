package com.helpVeterinary.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class welcomeController {
	
	 @GetMapping("/")
	  public String index(Model model, Principal principal) {
	    model.addAttribute("message", "You are logged in as " + principal.getName());
	    return "welcome";
	  }
	
	@GetMapping(path = "/welcome")
    public String welcome(Model model) {
        return "welcome";
    }
	
	@GetMapping(path = "/registration")
    public String registration(Model model) {
        return "registration";
    }
	
	
}
