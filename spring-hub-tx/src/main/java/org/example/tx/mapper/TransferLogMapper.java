package org.example.tx.mapper;

import org.example.tx.entity.TransferLog;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferLogMapper {

    int save(TransferLog log);

}
