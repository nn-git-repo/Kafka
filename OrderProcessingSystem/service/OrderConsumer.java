package com.example.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafka.model.Order;

@Service
public class OrderConsumer {

	 @KafkaListener(topics = "order-topic", groupId = "order-group")
	    public void consume(Order order) {
	        System.out.println("Received Order: " + order);
	    }
}
