package org.restful.example.entity;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String name;
    private String type;
    private String description;
}
