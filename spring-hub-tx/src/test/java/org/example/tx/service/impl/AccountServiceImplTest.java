package org.example.tx.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.tx.config.SpringConfig;
import org.example.tx.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@Slf4j
@SpringJUnitConfig(SpringConfig.class)
class AccountServiceImplTest {

    @Autowired
    private AccountService accountService;

    @Test
    void test() {
        accountService.transfer("张三", "李四", 100d);
    }

}