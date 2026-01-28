package org.example.tx.service.impl;

import org.example.tx.entity.TransferLog;
import org.example.tx.mapper.TransferLogMapper;
import org.example.tx.service.TransferLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TransferLogServiceImpl implements TransferLogService {

    @Autowired
    private TransferLogMapper transferLogMapper;

    @Override
    public void save(String info) {
        TransferLog transferLog = new TransferLog();
        transferLog.setInfo(info);
        transferLog.setCreateTime(LocalDateTime.now());
        transferLogMapper.save(transferLog);
    }
}
