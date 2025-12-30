package com.design.simplefactory;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a product information post.
 *
 */
@Setter
@Getter
public class ProductPost extends Post{
	private String imageUrl;
	private String name;
}
