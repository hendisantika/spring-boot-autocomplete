package com.hendisantika.springbootautocomplete.controller;

import com.hendisantika.springbootautocomplete.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-autocomplete
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/08/18
 * Time: 06.42
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "product/index";
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    @ResponseBody
    public List<String> search(HttpServletRequest request) {
        return productService.search(request.getParameter("term"));
    }

}