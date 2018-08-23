package com.hendisantika.springbootautocomplete.service;

import com.hendisantika.springbootautocomplete.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-autocomplete
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/08/18
 * Time: 06.41
 * To change this template use File | Settings | File Templates.
 */
@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<String> search(String keyword) {
        return productRepository.search(keyword);
    }

}
