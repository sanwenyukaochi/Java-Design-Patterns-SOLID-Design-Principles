package com.patterns.design.simplefactory.post;

import com.patterns.design.simplefactory.post.base.Post;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Represents a product information post. 
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ProductPost extends Post {
	private String imageUrl;
	private String name;
}
