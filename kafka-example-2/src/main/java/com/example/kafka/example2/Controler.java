package com.example.kafka.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
    @Autowired
    Producer p;
    @GetMapping("/kafka2")
    public String contr(@RequestParam String name){
        p.show(name);
        return name;
    }

}
