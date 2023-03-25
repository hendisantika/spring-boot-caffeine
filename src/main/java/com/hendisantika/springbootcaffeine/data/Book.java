package com.hendisantika.springbootcaffeine.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-caffeine
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/25/23
 * Time: 08:09
 * To change this template use File | Settings | File Templates.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private String isbn10;
    private String title;
    private int format;
}
