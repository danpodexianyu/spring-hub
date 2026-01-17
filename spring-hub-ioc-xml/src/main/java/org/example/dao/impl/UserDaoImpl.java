package org.example.dao.impl;

import org.example.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoImpl implements UserDao {

    private static final Logger log = LoggerFactory.getLogger(UserDaoImpl.class);

    @Override
    public void save() {
        log.info("User dao save...");
    }
}
