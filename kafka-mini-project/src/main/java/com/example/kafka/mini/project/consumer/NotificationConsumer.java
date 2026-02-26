package com.example.kafka.mini.project.consumer;

import com.example.kafka.mini.project.model.Model;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class NotificationConsumer {


        @KafkaListener(topics = "project-topic",groupId = "notify")
        public void consume(Model model){
            System.out.println("notification consumer order recieved with "+model.getOrderId());
        }
    }

