package com.hendisantika.springbootcaffeine;

import com.hendisantika.springbootcaffeine.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringBootCaffeineApplication implements CommandLineRunner {
    private static final Logger LOG = LoggerFactory.getLogger(SpringBootCaffeineApplication.class);

    @Autowired
    CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCaffeineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        LOG.info("Starting the Caffeine cache testing process");
        customerService.getCustomer(1l); //No hit , since this is the first request.
        customerService.getCustomer(2l); //No hit , since this is the first request.
        customerService.getCustomer(1l); //hit , since it is already in the cache.
        customerService.getCustomer(1l); //hit , since it is already in the cache.
        customerService.getCustomer(1l); //hit , since it is already in the cache.
        customerService.getCustomer(1l); //hit , since it is already in the cache.
    }
}
