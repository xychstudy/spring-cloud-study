package com.example.service;

import com.example.entity.AccountEntity;

public interface AccountService {
    AccountEntity getUserById(int uid);
}