package org.example.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.dao.UserDao;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save() {
        log.info("user service save...");
        userDao.save();
    }
}
