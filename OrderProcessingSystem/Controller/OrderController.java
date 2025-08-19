package com.example.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.model.Order;
import com.example.kafka.service.OrderProducer;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	
	  @Autowired
	    private OrderProducer producer;

	    @PostMapping
	    public String placeOrder(@RequestBody Order order) {
	        producer.sendOrder(order);
	        return "Order sent to Kafka successfully!";
	    }
}
