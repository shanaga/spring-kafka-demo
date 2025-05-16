package com.shanaga.kafka.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "${topic.name}", groupId = "kafka-demo-group")
    public void listen(String message) {
        System.out.println("Received message : " + message);
    }
}
