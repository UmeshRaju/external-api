package com.springbootpractise.ExternalApiIntegration.controller;

import com.springbootpractise.ExternalApiIntegration.model.Post;
import com.springbootpractise.ExternalApiIntegration.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping
    public List<Post> getAll() {
        return service.getAllPosts();
    }

    @GetMapping("/{id}")
    public Post getById(@PathVariable int id) {
        return service.getPostById(id);
    }
}

