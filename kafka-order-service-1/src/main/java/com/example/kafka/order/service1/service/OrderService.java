package com.example.kafka.order.service1.service;

import com.example.kafka.order.service1.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;
    public Order order(Order order){
        kafkaTemplate.send("order-topic",order);
        return order;
    }
}
