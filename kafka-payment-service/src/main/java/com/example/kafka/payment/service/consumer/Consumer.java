package com.example.kafka.payment.service.consumer;

import com.example.kafka.payment.service.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @KafkaListener(topics = "order-topics-11",groupId = "payment-group1")
    public void consume(Order o){
        System.out.println("consumed"+o);
    }
}
