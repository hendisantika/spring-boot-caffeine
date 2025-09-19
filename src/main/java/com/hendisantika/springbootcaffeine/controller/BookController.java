package com.hendisantika.springbootcaffeine.controller;

import com.hendisantika.springbootcaffeine.data.Book;
import com.hendisantika.springbootcaffeine.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-caffeine
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/25/23
 * Time: 08:13
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{isbn}")
    public Book findBook(@PathVariable(required = true, value = "isbn") String isbn) {
        return bookService.findBook(isbn);
    }
}
