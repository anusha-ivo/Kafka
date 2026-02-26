package com.example.kafka.mini.project.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
public class Model {
    private  String orderId;
    private  String userId;
    private  String product;
    private double price;



}
