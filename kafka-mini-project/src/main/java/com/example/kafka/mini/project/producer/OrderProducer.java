package com.example.kafka.mini.project.producer;

import com.example.kafka.mini.project.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
    public void sendorder(Model model){
        kafkaTemplate.send("project-topic",model.getUserId(),model);
    }
}
