package se.lexicon.mvc_thymeleaf_workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HandController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
