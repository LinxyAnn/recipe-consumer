package com.larecette.recipeconsumer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Recipe Entity for Elasticsearch Database
 */

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "recipes", type = "_doc")
public class RecipeElastic {

    @Id
    private String id;

    @NotNull
    private String recipeName;

    @NotNull
    private String description;

    @NotNull
    private Integer time;

    @NotNull
    private Integer difficulty;

    @NotNull
    private String cuisine;

    @NotNull
    private Double calories;

    @Field(type = FieldType.Nested, includeInParent = true)
    @EqualsAndHashCode.Exclude
    private List<IngredientElastic> ingredientList;

}
