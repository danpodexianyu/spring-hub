package org.example.dao.impl;

import org.example.dao.BookDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookDaoImpl implements BookDao {

    private static final Logger log = LoggerFactory.getLogger(BookDaoImpl.class);

    public BookDaoImpl() {
        log.info("Book dao constructor is running...");
    }

    @Override
    public void save() {
        log.info("book dao save...");
    }
}
