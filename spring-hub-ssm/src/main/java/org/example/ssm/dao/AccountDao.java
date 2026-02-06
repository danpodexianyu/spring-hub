package org.example.ssm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.ssm.bean.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountDao {
    List<Account> selectAll();
}
