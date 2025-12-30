package com.design.simplefactory;

public class Client {

    static void main(String[] args) {
        BlogPost blogPost = (BlogPost) PostFactory.createPost("blog");
        NewsPost newsPost = (NewsPost) PostFactory.createPost("news");
        ProductPost productPost = (ProductPost) PostFactory.createPost("product");
    }

}
