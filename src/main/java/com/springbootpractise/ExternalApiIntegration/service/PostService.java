package com.springbootpractise.ExternalApiIntegration.service;


import com.springbootpractise.ExternalApiIntegration.model.Post;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    private RestTemplate restTemplate;

    public PostService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private final String BASE_URL = "https://jsonplaceholder.org";

    public List<Post> getAllPosts() {
        Post[] posts = restTemplate.getForObject(BASE_URL + "/posts", Post[].class);
        return Arrays.asList(posts);
    }

    public Post getPostById(int id) {
        return restTemplate.getForObject(BASE_URL + "/posts/" + id, Post.class);
    }
}
