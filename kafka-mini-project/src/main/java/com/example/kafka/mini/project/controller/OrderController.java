package com.example.kafka.mini.project.controller;


import com.example.kafka.mini.project.model.Model;
import com.example.kafka.mini.project.producer.OrderProducer;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderProducer orderProducer;
    @PostMapping("/order")
    public String order(@RequestBody Model model){
        orderProducer.sendorder(model);
        return "order event is published";
    }

}
