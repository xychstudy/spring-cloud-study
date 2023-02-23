package com.example.res;

import com.example.entity.AccountEntity;
import com.example.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserBorrowDetail {
    AccountEntity user;
    List<Book> bookList;
}