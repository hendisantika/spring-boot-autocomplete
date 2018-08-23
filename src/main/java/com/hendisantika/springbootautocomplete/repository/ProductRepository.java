package com.hendisantika.springbootautocomplete.repository;

import com.hendisantika.springbootautocomplete.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

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
@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query("SELECT name FROM Product where name like %:keyword%")
    List<String> search(@Param("keyword") String keyword);

}