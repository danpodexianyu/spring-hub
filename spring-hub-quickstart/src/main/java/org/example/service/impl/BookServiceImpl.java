package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookServiceImpl implements BookService {

    private static final Logger log = LoggerFactory.getLogger(BookServiceImpl.class);

    private BookDao bookDao;

    @Override
    public void save() {
        log.info("book service save...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
