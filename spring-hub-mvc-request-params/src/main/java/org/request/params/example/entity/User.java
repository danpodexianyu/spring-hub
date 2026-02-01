package org.request.params.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String gender;
    private List<String> hobbies;
    private String intro;
}
