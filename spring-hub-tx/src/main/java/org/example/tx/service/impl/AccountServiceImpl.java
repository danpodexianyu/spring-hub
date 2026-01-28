package org.example.tx.service.impl;

import org.example.tx.mapper.AccountMapper;
import org.example.tx.service.AccountService;
import org.example.tx.service.TransferLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private TransferLogService transferLogService;

    @Override
    public void transfer(String out, String in, Double money) {
        try {
            accountMapper.outMoney(out, money);
            // int i = 1 / 0;
            accountMapper.outMoney(in, money);
        } finally {
            transferLogService.save("转账操作由 " + out + " 向 " + in + ", 转账金额: " + money + "元");
        }
    }
}
