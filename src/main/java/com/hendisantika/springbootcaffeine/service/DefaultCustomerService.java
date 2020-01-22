package com.hendisantika.springbootcaffeine.service;

import com.hendisantika.springbootcaffeine.data.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-caffeine
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/01/20
 * Time: 06.03
 */
@Service
@CacheConfig(cacheNames = {"customer"})
public class DefaultCustomerService implements CustomerService {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultCustomerService.class);

    @Cacheable
    @Override
    public Customer getCustomer(Long customerID) {
        LOG.info("Trying to get customer information for id {} ", customerID);
        return getCustomerData(customerID);
    }

    private Customer getCustomerData(final Long id) {
        Customer customer = new Customer(id, "testemail@test.com", "Test Customer");
        return customer;
    }
}