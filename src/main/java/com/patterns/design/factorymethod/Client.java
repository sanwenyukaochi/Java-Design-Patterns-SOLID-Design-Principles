package com.patterns.design.factorymethod;

import com.patterns.design.factorymethod.message.JSONMessage;
import com.patterns.design.factorymethod.message.TextMessage;
import com.patterns.design.factorymethod.message.base.Message;
import com.patterns.design.factorymethod.messageCreator.JSONMessageCreator;
import com.patterns.design.factorymethod.messageCreator.base.MessageCreator;
import com.patterns.design.factorymethod.messageCreator.TextMessageCreator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

	public static void main(String[] args) {

		JSONMessage jsonMessage = (JSONMessage) new JSONMessageCreator().createMessage();
		log.info(jsonMessage.getContent());
		TextMessage textMessage = (TextMessage) new TextMessageCreator().createMessage();
		log.info(textMessage.getContent());
		
		/*
		 printMessage(new JSONMessageCreator());
		 printMessage(new TextMessageCreator());
		*/
    }
	
	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg);
	}
}
