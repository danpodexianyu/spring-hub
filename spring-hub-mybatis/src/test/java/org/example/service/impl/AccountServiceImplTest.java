package org.example.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.config.SpringConfig;
import org.example.entity.Account;
import org.example.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@Slf4j
@SpringJUnitConfig(classes = SpringConfig.class)
class AccountServiceImplTest {

    @Autowired
    private AccountService accountService;

    @Test
    void getAll() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        log.info("{}", accountService.getAll());
    }

    @Test
    void testJunit() {
        List<Account> accounts = accountService.getAll();
        log.info("{}", accounts);
    }
}