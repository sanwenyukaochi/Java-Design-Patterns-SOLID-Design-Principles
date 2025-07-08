package com.patterns.design.factorymethod.message;

import com.patterns.design.factorymethod.message.base.Message;

public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}
	
}
