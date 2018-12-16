package com.baizhi.controller;

import com.baizhi.entity.Product;
import com.baizhi.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/test")
public class ProductController {

    @Autowired
    private ProductMapper productMapper;


    @RequestMapping("/test")
    private String test(HttpSession session){
        List<Product> products = productMapper.selectAll();
        session.setAttribute("products", products);
        return "index";
    }

}
