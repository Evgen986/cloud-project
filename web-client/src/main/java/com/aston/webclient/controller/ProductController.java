package com.aston.webclient.controller;

import com.aston.webclient.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/")
    public String getProducts(Model model){
        model.addAttribute("productsStorageOne", productService.getProductsStorageOne());
        model.addAttribute("productsStorageTwo", productService.getProductsStorageTwo());
        return "products";
    }

}
