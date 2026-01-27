package org.example.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.config.SpringConfig;
import org.example.entity.Account;
import org.example.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringJUnitConfig(SpringConfig.class)
class AccountServiceImplTest {

    @Autowired
    private AccountService accountService;

    @Test
    void getAll() {
        List<Account> accounts = accountService.getAll();
        log.info("{}", accounts);
    }
}