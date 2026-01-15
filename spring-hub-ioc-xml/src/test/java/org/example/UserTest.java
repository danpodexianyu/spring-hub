package org.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserTest {

    private static final Logger log = LoggerFactory.getLogger(UserTest.class);

    @Test
    void testIoCXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // 1. 根据id获取Bean
        User user1 = (User) context.getBean("user");
        log.info("1. 根据id获取Bean: {}", user1);

        // 2. 根据类型获取 Bean
        User user2 = context.getBean(User.class);
        log.info("2. 根据类型获取Bean: {}", user2);

        // 3. 根据id和类型获取Bean
        User user3 = context.getBean("user", User.class);
        log.info("3. 根据id和类型获取Bean: {}", user3);
    }

    @Test
    void testDI() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = context.getBean("zhangsan", User.class);
        log.info("{}", user);
    }
}