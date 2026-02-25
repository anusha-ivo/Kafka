package com.example.kafka.order.service1.controller;

import com.example.kafka.order.service1.order.Order;
import com.example.kafka.order.service1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCls {
    @Autowired
    OrderService orderService;
    @GetMapping("/order")
    public Order con(@RequestBody Order order){
        orderService.order(order);
        System.out.println("Sending order: " + order);
        return order;
    }
}
