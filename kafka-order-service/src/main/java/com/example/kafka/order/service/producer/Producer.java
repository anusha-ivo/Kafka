package com.example.kafka.order.service.producer;

import com.example.kafka.order.service.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    @Autowired
    private KafkaTemplate<String,Order> k;
    public void produce(Order o){
        k.send("order-topics-11",o);
        System.out.println("datat sent to kaafka");


    }


}
