package org.example.ssm.service.impl;

import org.example.ssm.bean.Account;
import org.example.ssm.dao.AccountDao;
import org.example.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> getAll() {
        return accountDao.selectAll();
    }
}
