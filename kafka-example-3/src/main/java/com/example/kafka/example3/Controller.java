package com.example.kafka.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Producer p;
    @GetMapping("/kafka3")
    public String con(@RequestParam String name ){
        p.produce(name);
        return name;

    }

}
