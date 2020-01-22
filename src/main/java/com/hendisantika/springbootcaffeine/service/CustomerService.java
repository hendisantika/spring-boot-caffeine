package com.hendisantika.springbootcaffeine.service;

import com.hendisantika.springbootcaffeine.data.Customer;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-caffeine
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/01/20
 * Time: 06.03
 */
public interface CustomerService {
    Customer getCustomer(final Long customerID);
}
