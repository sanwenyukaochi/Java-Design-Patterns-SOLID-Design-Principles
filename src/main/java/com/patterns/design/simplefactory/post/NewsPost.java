package com.patterns.design.simplefactory.post;

import com.patterns.design.simplefactory.post.base.Post;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * Represents a news post.
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class NewsPost extends Post {
	private String headline;
	private LocalDate newsTime;
}
