package com.patterns.design.factorymethod.messageCreator;


import com.patterns.design.factorymethod.message.JSONMessage;
import com.patterns.design.factorymethod.message.base.Message;
import com.patterns.design.factorymethod.messageCreator.base.MessageCreator;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}
	
}
