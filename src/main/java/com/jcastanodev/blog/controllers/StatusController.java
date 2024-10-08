package com.jcastanodev.blog.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StatusController {
    @GetMapping
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Blog MS is running");
    }
}
