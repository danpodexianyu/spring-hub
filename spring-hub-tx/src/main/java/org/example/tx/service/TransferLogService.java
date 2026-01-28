package org.example.tx.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface TransferLogService {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void save(String info);

}
