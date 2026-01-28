package org.example.tx.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.tx.config.SpringConfig;
import org.example.tx.entity.Account;
import org.example.tx.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@Slf4j
@SpringJUnitConfig(SpringConfig.class)
class AccountServiceImplTest {

    @Autowired
    private AccountService accountService;

    @Test
    void test() {
        List<Account> all = accountService.getAll();
        log.info("{}", all);
    }

}