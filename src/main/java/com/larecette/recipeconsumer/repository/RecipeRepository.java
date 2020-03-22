package com.larecette.recipeconsumer.repository;

import com.larecette.recipeconsumer.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 *  Repository for Recipe Entity Elasticsearch Database
 */

public interface RecipeRepository extends ElasticsearchRepository<User, Long> {
}
