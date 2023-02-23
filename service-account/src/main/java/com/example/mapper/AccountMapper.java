package com.example.mapper;

import com.example.entity.AccountEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountMapper {
    @Select("select * from db_account where uid = #{uid}")
    AccountEntity getUserById(int uid);
}