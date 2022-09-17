package com.example.blogadmin_26.controller;

import com.example.blogadmin_26.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    // Danh sách tất cả các bài viết
    @GetMapping("admin/blogs")
    public String getBlogPage(){

        return "admin/blog/blog-index";
    }

    //Danh sách bài viết của tôi
    @GetMapping("admin/blogs/own-blogs")
    public String getOwnBlogPage(){
        return "admin/blog/blog-yourself";
    }

    //Tạo Bài viết
    @GetMapping("admin/blogs/create")
    public String getBlogCreatePage(){
        return "admin/blog/blog-create";
    }

    // Chi tiết bài viết
    @GetMapping("admin/blogs/{id}/detail")
    public String getBlogDetailPage(@PathVariable String id){
        return "admin/blog/blog-detail";
    }
}
