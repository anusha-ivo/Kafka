package com.example.kafka.payment.service.model;

import lombok.Data;

@Data
public class Order {
    private String name;
    private int quantity;
}
