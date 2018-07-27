package com.helpVeterinary.fe.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistoriesController {

    @GetMapping("/histories")
    public String root() {
        return "histories";
    }



}
