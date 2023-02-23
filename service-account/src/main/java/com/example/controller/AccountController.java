package com.example.controller;

import com.example.entity.AccountEntity;
import com.example.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Resource
    AccountService service;

    //这里以RESTFul风格为例
    @RequestMapping("/account/{uid}")
    public AccountEntity findUserById(@PathVariable("uid") int uid){
        return service.getUserById(uid);
    }
}