package org.example.factory;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;

public class UserDaoFactory {

    public UserDao createUserDao() {
        return new UserDaoImpl();
    }
}
