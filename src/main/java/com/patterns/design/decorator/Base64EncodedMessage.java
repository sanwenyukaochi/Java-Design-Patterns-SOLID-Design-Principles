package com.patterns.design.decorator;

import lombok.AllArgsConstructor;

import java.util.Base64;

@AllArgsConstructor
public class Base64EncodedMessage implements Message {

	private Message msg;

	@Override
	public String getContent() {
		//Be wary of charset!! This is platform dependent..
		return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
	}
	
	
}
