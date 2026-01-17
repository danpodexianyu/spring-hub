package org.example.factory;

import org.example.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserFactoryBeanTest {

    @Test
    void testFactoryBean() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDao userDao = ctx.getBean("userDaoFactoryBean", UserDao.class);
        userDao.save();
    }
}