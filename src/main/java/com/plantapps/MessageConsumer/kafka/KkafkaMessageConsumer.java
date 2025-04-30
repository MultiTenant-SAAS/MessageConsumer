package com.plantapps.MessageConsumer.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.plantapps.MessageConsumer.model.Message;

@Service
public class KkafkaMessageConsumer
{
//	@KafkaListener(topics = "site_1", groupId = "message_1")
//	public void mesageConsumer(Message message)
//	{
//		System.out.println("the message received is : "+message);
//	}
	
	@KafkaListener(topics = "site_1", groupId = "message_1")
	public void mesageConsumer(ConsumerRecord<String, Message> record)
	{
		Message message = record.value();
		String id = new String(record.headers().lastHeader("tenantId").value());
		if("tenant-1".equals(id))
		{
			System.out.println("the message received from tenant-1 is : "+message.getData());
		}
		if("tenant-2".equals(id))
		{
			System.out.println("the message received from tenant-2 is : "+message.getData());
		}
	}
}
