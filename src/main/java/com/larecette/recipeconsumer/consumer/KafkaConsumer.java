package com.larecette.recipeconsumer.consumer;

import com.larecette.recipeconsumer.model.RecipeElastic;
import com.larecette.recipeconsumer.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    private final RecipeService recipeService;

    public KafkaConsumer(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @KafkaListener(topics = "KafkaExampleString", groupId = "group_id")
    public void consume(String message) {
        log.info("Consumed message: " + message);
    }

    @KafkaListener(topics = "RecipeTest", groupId = "group_json", containerFactory = "recipeKafkaListenerFactory")
    public void consumeJson(RecipeElastic recipeElastic) {
        recipeService.createRecipe(recipeElastic);
        log.info("Consumed JSON message: " + recipeElastic.toString());
    }
}
