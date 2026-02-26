package com.example.kafka.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    @Autowired
    private KafkaTemplate<String,String> k;
    public void produce(String quality){
        k.send("topic-3",quality);
    }
}
