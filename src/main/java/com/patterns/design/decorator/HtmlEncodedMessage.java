package com.patterns.design.decorator;

import lombok.AllArgsConstructor;
import org.apache.commons.text.StringEscapeUtils;

//Decorator. Implements component interface
@AllArgsConstructor
public class HtmlEncodedMessage implements Message {

	private Message msg;
	
	@Override
	public String getContent() {
		return StringEscapeUtils.escapeHtml4(msg.getContent());
	}

	
}
