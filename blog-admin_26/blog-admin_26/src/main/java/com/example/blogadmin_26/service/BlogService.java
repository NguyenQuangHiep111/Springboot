package com.example.blogadmin_26.service;

import com.example.blogadmin_26.dto.BlogDto;
import com.example.blogadmin_26.entity.Blog;
import com.example.blogadmin_26.repository.BlogRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class BlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Autowired
    private ModelMapper modelMapper;
    public List<BlogDto> getAllBlogDto(){
        List<Blog> blogs = blogRepository.findAll();

        return blogs.stream().map(blog -> modelMapper.map(blog,BlogDto.class))
                .sorted().collect(Collectors.toList());
    }
}
