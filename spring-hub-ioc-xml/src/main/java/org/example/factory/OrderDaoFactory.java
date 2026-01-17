package org.example.factory;

import org.example.dao.OrderDao;
import org.example.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {

    public static OrderDao getOrderDao() {
        return new OrderDaoImpl();
    }
}
