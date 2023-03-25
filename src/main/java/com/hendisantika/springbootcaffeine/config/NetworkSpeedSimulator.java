package com.hendisantika.springbootcaffeine.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-caffeine
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/25/23
 * Time: 08:07
 * To change this template use File | Settings | File Templates.
 */
public class NetworkSpeedSimulator {
    private static final Logger LOGGER = LoggerFactory.getLogger(NetworkSpeedSimulator.class);

    public static void slowSpeed(long milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            LOGGER.error("Error durring simulate network speed", e);
        }
    }
}
