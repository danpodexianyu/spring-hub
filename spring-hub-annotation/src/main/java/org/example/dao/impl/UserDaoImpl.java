package org.example.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.dao.UserDao;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        log.info("user dao save...");
    }
}
