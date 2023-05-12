package com.example.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    // Cần role EDITOR (authenticated) mới có thể vào
    @GetMapping("/admin/blogs")
    public String getBlogs(){
        return "blog";
    }

    // Cần role ADMIN (authenticated) mới có thể vào
    @GetMapping("/admin/users")
    public String getUser(){
        return "user";
    }
}
