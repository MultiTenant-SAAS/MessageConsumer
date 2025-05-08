package com.plantapps.MessageConsumer.config;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.plantapps.MessageConsumer.model.Message;

@Controller
public class WebSocketClientMessageController
{
	@MessageMapping("/sendFromTenant")
	//@SendTo("/topic/site_1")
	public void receivedMessagetenant1(Message message) 
	{
		System.out.println("====> Message From "+message.getId()+" : "+message.getData());
	}
	
}
