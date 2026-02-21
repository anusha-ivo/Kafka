package com.example.kafka.mini.project.consumer;

import com.example.kafka.mini.project.model.Model;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumer {
    @KafkaListener(topics = "project-topic",groupId = "payment")
    public void consumes(Model model){
        System.out.println("paymenet consumer order recieved with "+model.getOrderId()+model);
    }
}
