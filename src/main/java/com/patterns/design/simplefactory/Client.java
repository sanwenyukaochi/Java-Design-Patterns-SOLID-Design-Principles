package com.patterns.design.simplefactory;

import com.patterns.design.simplefactory.enums.PostType;
import com.patterns.design.simplefactory.post.*;
import com.patterns.design.simplefactory.post.base.Post;
import lombok.extern.slf4j.Slf4j;
import com.patterns.design.simplefactory.factory.PostFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

@Slf4j
public class Client {

	public static void main(String[] args) {
		Post postBlog = PostFactory.createPost(PostType.BLOG);
		BlogPost blogPost = (BlogPost) postBlog;
		blogPost.setAuthor("Author");
		blogPost.setTags(new String[]{"java", "spring", "design"});
		blogPost.setId(new Random().nextLong());
		blogPost.setTitle("BlogTitle");
		blogPost.setContent("BlogContent");
		blogPost.setCreatedOn(LocalDateTime.now());
		blogPost.setPublishedOn(LocalDateTime.now());
		log.info("postBlog: {}", blogPost);
		
		Post postNews = PostFactory.createPost(PostType.NEWS);
		NewsPost newsPost = (NewsPost) postNews;
		newsPost.setHeadline("NewsHeadline");
		newsPost.setNewsTime(LocalDate.from(LocalDateTime.now()));
		newsPost.setId(new Random().nextLong());
		newsPost.setTitle("NewsTitle");
		newsPost.setContent("NewsContent");
		newsPost.setCreatedOn(LocalDateTime.now());
		newsPost.setPublishedOn(LocalDateTime.now());
		log.info("postNews: {}", newsPost);

		Post postProduct = PostFactory.createPost(PostType.PRODUCT);
		ProductPost productPost = (ProductPost) postProduct;
		productPost.setImageUrl("https://image.com");
		productPost.setName("ProductName");
		productPost.setId(new Random().nextLong());
		productPost.setTitle("ProductTitle");
		productPost.setContent("ProductContent");
		productPost.setCreatedOn(LocalDateTime.now());
		productPost.setPublishedOn(LocalDateTime.now());
		log.info("postProduct: {}", productPost);

	}

}
