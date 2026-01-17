package org.example.factory;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

public class UserFactoryBean implements FactoryBean<UserDao> {
    @Nullable
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
