package com.example.shop.controller;

import com.example.shop.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String getHomPage(){
        return "index";
        //return ProductService.getProducts();
    }

    @GetMapping("/shop")
    public String getShopPage(){
        return "shop";
    }

    @GetMapping("/contact")
    public String getContactPage(){
        return "contact";
    }

    @GetMapping("/buy")
    public String getBuyPage(){
        return "buy";
    }
}
