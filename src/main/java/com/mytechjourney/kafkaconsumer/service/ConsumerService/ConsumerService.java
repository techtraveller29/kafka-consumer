package com.mytechjourney.kafkaconsumer.service.ConsumerService;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ConsumerService {

    @KafkaListener(topics = "first_topic", groupId = "myGroup")
    public void consumeMessages(String message){
        log.info("Message received: "+message);
    }
}