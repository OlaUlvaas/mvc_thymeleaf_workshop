package se.lexicon.mvc_thymeleaf_workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/product")
public class ProductManagementController {

    @GetMapping("/")
    public String getAll(){
        return "productManagement";
    }


}
