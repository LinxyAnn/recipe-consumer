package com.larecette.recipeconsumer.service;

import com.larecette.recipeconsumer.model.User;
import com.larecette.recipeconsumer.repository.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    /**
     * Create new recipe in Elasticsearch.
     *
     * @param recipeElastic entity with all fields.
     * @return entity after save to database.
     */
    public User createRecipe(User recipeElastic) {
        return recipeRepository.save(recipeElastic);
    }
}
