package com.patterns.design.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;

//Concrete component. Object to be decorated
@AllArgsConstructor
public class TextMessage implements Message {

	private final String msg;
	
	@Override
	public String getContent() {
		return msg;
	}
}
