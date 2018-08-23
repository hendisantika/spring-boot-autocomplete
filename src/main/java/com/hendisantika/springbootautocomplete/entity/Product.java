package com.hendisantika.springbootautocomplete.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-autocomplete
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/08/18
 * Time: 06.38
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "product")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private BigDecimal price;

    @Column
    private int quantity;

    @Column
    private String description;

    @Column
    private boolean status;

}

