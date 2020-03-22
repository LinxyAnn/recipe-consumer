package com.larecette.recipeconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "KafkaExampleString", groupId = "group_id")
    public void consume(String message) {
        log.info("Consumed message: " + message);
    }
}