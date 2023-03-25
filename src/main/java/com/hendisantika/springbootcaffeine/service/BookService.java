package com.hendisantika.springbootcaffeine.service;

import com.hendisantika.springbootcaffeine.config.NetworkSpeedSimulator;
import com.hendisantika.springbootcaffeine.data.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-caffeine
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/25/23
 * Time: 08:10
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BookService {
    @Value("${demo.wait.duration:3000}")
    private long waitDuration;

    @Cacheable(cacheNames = "getBookWithCache", key = "#isbn")
    public Book findBook(String isbn) {
        NetworkSpeedSimulator.slowSpeed(waitDuration);
        return new Book("0134685997", "Effective Java", 1);
    }
}
