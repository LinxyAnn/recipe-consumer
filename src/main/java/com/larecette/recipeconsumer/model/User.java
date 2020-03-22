package com.larecette.recipeconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "users", type = "_doc")
public class User {
    private Long id;
    private String name;
    private String dept;
    private Long salary;
}
