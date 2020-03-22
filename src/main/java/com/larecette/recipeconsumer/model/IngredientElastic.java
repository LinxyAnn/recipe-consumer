package com.larecette.recipeconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Nested Ingredient Entity for Spanner Database
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientElastic {

    private String productId;

    private String name;

    private String measureUnit;

    private Double calories;

    private Double amount;
}
