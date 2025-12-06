package com.springbootpractise.ExternalApiIntegration.model;

import lombok.Data;

@Data
public class Post {
    private int id;
    private String title;
    private String content;
    private String category;
}
