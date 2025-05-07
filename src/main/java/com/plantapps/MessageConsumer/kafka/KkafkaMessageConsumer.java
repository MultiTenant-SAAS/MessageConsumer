package com.plantapps.MessageConsumer.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.plantapps.MessageConsumer.model.Message;

@Service
public class KkafkaMessageConsumer
{
	
	@KafkaListener(topics = "site_1", groupId = "message_1")
	public void mesageConsumer1(ConsumerRecord<String, Message> record)
	{
		Message message = record.value();
		//String id = new String(record.headers().lastHeader("tenantId").value());
		System.out.println("the message received from site_1 tenant-1 is : " + message.getData());
	}
	
	@KafkaListener(topics = "site_2", groupId = "message_1")
	public void mesageConsumer2(ConsumerRecord<String, Message> record)
	{
		Message message = record.value();
		//String id = new String(record.headers().lastHeader("tenantId").value());

		System.out.println("the message received from site_2 tenant-2 is : " + message.getData());
	}
}
