package com.hendisantika.springbootautocomplete.service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-autocomplete
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/08/18
 * Time: 06.40
 * To change this template use File | Settings | File Templates.
 */
public interface ProductService {
    List<String> search(String keyword);
}
