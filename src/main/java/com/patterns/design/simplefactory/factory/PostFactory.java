package com.patterns.design.simplefactory.factory;


import com.patterns.design.simplefactory.enums.PostType;
import com.patterns.design.simplefactory.post.BlogPost;
import com.patterns.design.simplefactory.post.NewsPost;
import com.patterns.design.simplefactory.post.ProductPost;
import com.patterns.design.simplefactory.post.base.Post;

public class PostFactory {

    public static Post createPost(PostType type) {
        return switch (type) {
            case BLOG -> new BlogPost();
            case NEWS -> new NewsPost();
            case PRODUCT -> new ProductPost();
        };
    }
}
