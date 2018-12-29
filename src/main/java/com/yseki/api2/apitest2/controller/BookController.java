package com.yseki.api2.apitest2.controller;

import com.yseki.api2.apitest2.model.Book;
import com.yseki.api2.apitest2.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public Book getBook(){
        return bookService.getBook();
    }
}
