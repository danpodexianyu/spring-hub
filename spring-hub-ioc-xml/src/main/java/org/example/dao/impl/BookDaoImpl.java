package org.example.dao.impl;

import org.example.dao.BookDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookDaoImpl implements BookDao {

    private static final Logger log = LoggerFactory.getLogger(BookDaoImpl.class);

    @Override
    public void save() {
        log.info("book dao save...");
    }
}
