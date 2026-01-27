package org.example.service.impl;

import org.example.entity.Account;
import org.example.mapper.AccountMapper;
import org.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> getAll() {
        return accountMapper.selectAll();
    }
}
