package org.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserTest {

    private static final Logger log = LoggerFactory.getLogger(UserTest.class);

    @Test
    void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = context.getBean(User.class);
        log.info("{}", user);
    }

}