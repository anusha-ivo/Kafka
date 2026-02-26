package com.example.kafka.order.service.controller;

import com.example.kafka.order.service.model.Order;
import com.example.kafka.order.service.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Producer p;
    @PostMapping("/create")
    public Order create(@RequestBody Order o){
        p.produce(o);
        return o;

    }
}
