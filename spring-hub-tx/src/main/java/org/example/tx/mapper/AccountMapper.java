package org.example.tx.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {

    void inMoney(@Param("name") String name, @Param("money") Double money);

    void outMoney(@Param("name") String name, @Param("money") Double money);

}
