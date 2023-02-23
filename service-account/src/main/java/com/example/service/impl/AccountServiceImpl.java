package com.example.service.impl;

import com.example.entity.AccountEntity;
import com.example.mapper.AccountMapper;
import com.example.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    AccountMapper mapper;

    @Override
    public AccountEntity getUserById(int uid) {
        return mapper.getUserById(uid);
    }
}