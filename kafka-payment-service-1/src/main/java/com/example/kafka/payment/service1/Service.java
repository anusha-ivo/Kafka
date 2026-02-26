package com.example.kafka.payment.service1;



import com.example.kafka.payment.service1.order.Order;
import org.springframework.kafka.annotation.KafkaListener;

@org.springframework.stereotype.Service
public class Service {
    @KafkaListener(topics = "order-topic", groupId="payment-group")
    public void pay(Order order){
        System.out.println("recieved"+order);


    }
}
