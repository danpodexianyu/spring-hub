package org.example.service;

import org.example.service.impl.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class BookServiceTest {

    @Test
    void save() {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }

    @Test
    void testIoC() {
        // 记载配置文件得到上下文对象, 也就是容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        // 获取容器中注入的对象
        // BookDao bookDao = ctx.getBean(BookDao.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}