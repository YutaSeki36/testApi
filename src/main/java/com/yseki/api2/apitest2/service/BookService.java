package com.yseki.api2.apitest2.service;

import com.yseki.api2.apitest2.model.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    public Book getBook(){
        return Book.builder()
                .bookName("Spring入門")
                .description("springフレームワークの基礎を学べます")
                .build();
    }
}
