package org.example.dao.impl;

import org.example.dao.OrderDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderDaoImpl implements OrderDao {

    private static final Logger log = LoggerFactory.getLogger(OrderDaoImpl.class);

    @Override
    public void save() {
        log.info("Order dao save...");
    }
}
