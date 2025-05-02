package com.plantapps.MessageConsumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.plantapps.MessageConsumer.kafka.CustomListner;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class MessageConsumerApplication {

	@Autowired
	private CustomListner custistener;
	
	public static void main(String[] args) {
		SpringApplication.run(MessageConsumerApplication.class, args);
	}
	
//	@PostConstruct
//    public void init() {
//        List<String> tenantIds = List.of("1", "2"); // or load from DB
//        tenantIds.forEach(custistener::registerTenantListener);
//    }

}
