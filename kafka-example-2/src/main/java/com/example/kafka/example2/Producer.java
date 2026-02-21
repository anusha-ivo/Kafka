package com.example.kafka.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
     @Autowired
   private KafkaTemplate <String,String>k;
     public void show(String name){
         k.send("trial-topic",name);
     }


}
