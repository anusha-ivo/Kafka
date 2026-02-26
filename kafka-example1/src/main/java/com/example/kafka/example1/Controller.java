package com.example.kafka.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Producer p;
    @GetMapping("/kafka")
    public String dis(@RequestParam String msg){
        p.produce(msg);
        return msg;



    }

}
