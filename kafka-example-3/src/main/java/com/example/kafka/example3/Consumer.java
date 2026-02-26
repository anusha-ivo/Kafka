package com.example.kafka.example3;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component

public class Consumer {
    @KafkaListener(topics = "topic-3",groupId = "third")
    public void consume(String name){
        System.out.println(name);
    }

}
