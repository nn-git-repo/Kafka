package com.example.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.kafka.model.Order;

@Service
public class OrderProducer {

	 private static final String TOPIC = "order-topic";

	    @Autowired
	    private KafkaTemplate<String, Order> kafkaTemplate;

	    public void sendOrder(Order order) {
	        kafkaTemplate.send(TOPIC, order);
	    }
}
