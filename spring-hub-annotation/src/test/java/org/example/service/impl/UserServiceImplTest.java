package org.example.service.impl;

import org.example.config.SpringConfig;
import org.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class UserServiceImplTest {

    @Test
    void save() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.save();
    }
}