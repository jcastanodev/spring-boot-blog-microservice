package com.jcastanodev.blog.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.jcastanodev.blog.entities.BlogEntity;
import com.jcastanodev.blog.repositories.BlogRepository;

@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public List<BlogEntity> getAllBlogs() {
        return blogRepository.findAll();
    }
}
