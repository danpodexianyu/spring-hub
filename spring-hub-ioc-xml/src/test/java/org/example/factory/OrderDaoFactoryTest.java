package org.example.factory;

import org.example.dao.OrderDao;
import org.example.dao.impl.OrderDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class OrderDaoFactoryTest {

    @Test
    void getOrderDao() {
        // 通过静态工厂创建对象
        OrderDao orderDao = OrderDaoFactory.getOrderDao();
        orderDao.save();
    }

    @Test
    void testFactoryInstanceBean() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        OrderDao orderDao = ctx.getBean(OrderDao.class);
        orderDao.save();
    }
}