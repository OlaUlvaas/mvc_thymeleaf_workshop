package se.lexicon.mvc_thymeleaf_workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.lexicon.mvc_thymeleaf_workshop.dto.ProductDetailsDto;
import se.lexicon.mvc_thymeleaf_workshop.dto.ProductDto;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin/product")
public class ProductManagementController {
    List<ProductDto> productDtoList;

    @PostConstruct
    public void init(){
        if(productDtoList == null) productDtoList = new ArrayList<>();

        ProductDto productDto = new ProductDto();
        productDto.setId(1);
        productDto.setName("Kalle");
        productDto.setPrice(50);

        ProductDto productDto2 = new ProductDto();
        productDto2.setId(2);
        productDto2.setName("Pelle");
        productDto2.setPrice(100);

        ProductDetailsDto productDetailsDto = new ProductDetailsDto();
        productDetailsDto.setId(1);
        productDetailsDto.setName("Siri");
        productDetailsDto.setDescription("How to do...");

        ProductDetailsDto productDetailsDto2 = new ProductDetailsDto();
        productDetailsDto2.setId(2);
        productDetailsDto2.setName("Betty");
        productDetailsDto2.setDescription("What's up...");

        productDto.setProductDetailsDto(productDetailsDto);
        productDto2.setProductDetailsDto(productDetailsDto2);
        productDtoList.add(productDto);
        productDtoList.add(productDto2);
        productDtoList.add(productDto);
        productDtoList.add(productDto2);
        productDtoList.add(productDto);
        productDtoList.add(productDto2);
        productDtoList.add(productDto);
        productDtoList.add(productDto2);
    }
    @GetMapping("/")
    public String getAll(Model model){
        model.addAttribute("productDtoList", productDtoList);
        return "productManagement";
    }


}
