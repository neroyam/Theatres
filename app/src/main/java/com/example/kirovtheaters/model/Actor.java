package com.example.kirovtheaters.model;

public class Actor{
    private String name;
    private String imageUrl;

    public Actor(String name, String imageUrl){
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
