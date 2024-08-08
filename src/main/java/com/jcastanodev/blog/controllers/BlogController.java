package com.jcastanodev.blog.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcastanodev.blog.entities.BlogEntity;
import com.jcastanodev.blog.services.BlogService;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public List<BlogEntity> getAllBlogs() {
        System.out.println("Getting all blogs");
        List<BlogEntity> response = blogService.getAllBlogs();
        System.out.println("Response: " + response.size());
        return blogService.getAllBlogs();
    }
}
