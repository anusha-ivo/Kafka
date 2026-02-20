package com.example.kafka.example1;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @KafkaListener(topics = "first-topic-kafka",groupId = "first-grooup")
    public void consu(String msg){
        System.out.println("recieved"+msg);
    }
}
