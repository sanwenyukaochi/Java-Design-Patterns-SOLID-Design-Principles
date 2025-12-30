package com.design.simplefactory;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Represents a news post.
 *
 */
@Setter
@Getter
public class NewsPost extends Post{
	private String headline;
	private LocalDate newsTime;
}
