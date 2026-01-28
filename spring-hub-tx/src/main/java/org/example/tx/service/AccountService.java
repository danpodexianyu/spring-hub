package org.example.tx.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {

    /**
     * 转账操作
     *
     * @param out   转出账号
     * @param in    转入账号
     * @param money 金额
     */
    @Transactional
    void transfer(String out, String in, Double money);

}
