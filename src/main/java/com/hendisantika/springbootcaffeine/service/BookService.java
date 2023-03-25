package com.hendisantika.springbootcaffeine.service;

import org.springframework.beans.factory.annotation.Value;
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
}
