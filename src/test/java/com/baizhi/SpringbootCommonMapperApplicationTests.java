package com.baizhi;

import com.baizhi.entity.Product;
import com.baizhi.mapper.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCommonMapperApplicationTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void contextLoads() {

        Example example = new Example(Product.class);
        List<Product> products = productMapper.selectByExample(example);
        for (Product product : products) {
            System.out.println(product);
        }
    }

}

