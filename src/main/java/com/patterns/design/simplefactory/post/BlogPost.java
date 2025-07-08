package com.patterns.design.simplefactory.post;

import com.patterns.design.simplefactory.post.base.Post;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * Represents a blog post. 
 * 
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BlogPost extends Post {
	private String author;
	private String[] tags;
}
