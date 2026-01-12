package org.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserTest {

    private static final Logger log = LoggerFactory.getLogger(UserTest.class);

    @Test
    void testGetUserBean() {
        // 加载 spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建的对象
        User user = (User) context.getBean("user");
        log.info("{}", user);
        // 使用对象调用方法进行测试
        user.add();
    }
}