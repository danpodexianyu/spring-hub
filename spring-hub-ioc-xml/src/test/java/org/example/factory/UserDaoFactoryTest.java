package org.example.factory;

import org.example.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoFactoryTest {

    @Test
    void createUserDao() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDao userDao = ctx.getBean(UserDao.class);
        userDao.save();
    }
}