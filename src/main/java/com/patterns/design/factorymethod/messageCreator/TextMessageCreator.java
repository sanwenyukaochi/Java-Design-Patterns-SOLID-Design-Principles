package com.patterns.design.factorymethod.messageCreator;


import com.patterns.design.factorymethod.message.TextMessage;
import com.patterns.design.factorymethod.message.base.Message;
import com.patterns.design.factorymethod.messageCreator.base.MessageCreator;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}
	
}
