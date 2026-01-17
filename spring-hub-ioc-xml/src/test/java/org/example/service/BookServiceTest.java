package org.example.service;

import org.example.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    private static final Logger log = LoggerFactory.getLogger(BookServiceTest.class);

    @Test
    void testScope() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");

        log.info("{}", bookDao1);
        log.info("{}", bookDao2);
    }

    @Test
    void testBeanInstance() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();
    }
}