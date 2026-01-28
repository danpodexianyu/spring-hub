package org.example.tx.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransferLog {
    private Long id;
    private String info;
    private LocalDateTime createTime;
}
