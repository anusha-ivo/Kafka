package com.example.kafka.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    @Autowired
    private KafkaTemplate<String,String> k;
    public void produce(String msg){
        k.send("first-topic-kafka",msg);
    }

}
