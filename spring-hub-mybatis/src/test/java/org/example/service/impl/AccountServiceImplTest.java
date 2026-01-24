package org.example.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.config.SpringConfig;
import org.example.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
class AccountServiceImplTest {

    @Test
    void getAll() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        log.info("{}", accountService.getAll());
    }
}