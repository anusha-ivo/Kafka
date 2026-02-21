package com.example.kafka.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "trial-topic",groupId = "second")
    public void con(String name){
        System.out.println(name);

    }
}
