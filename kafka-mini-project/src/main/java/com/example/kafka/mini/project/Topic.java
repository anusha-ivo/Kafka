package com.example.kafka.mini.project;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
@Configuration
public class Topic {
    public NewTopic topic(){
        return TopicBuilder.name("project-topic").partitions(3).replicas(1).build();

    }

}
