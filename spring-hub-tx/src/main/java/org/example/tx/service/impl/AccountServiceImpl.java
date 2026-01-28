package org.example.tx.service.impl;

import org.example.tx.mapper.AccountMapper;
import org.example.tx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

}
