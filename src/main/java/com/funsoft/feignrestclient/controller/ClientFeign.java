package com.funsoft.feignrestclient.controller;

import com.funsoft.feignrestclient.FeignBuilderFactory;
import com.funsoft.feignrestclient.impl.ProductCalls;
import com.funsoft.feignrestclient.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientFeign {

    @GetMapping("/call")
    public Product call(){
        ProductCalls agent = FeignBuilderFactory.createClient(ProductCalls.class,"http://localhost:8082/products");
        Product response = agent.get_product(5);
        return response;
    }

    @GetMapping("/list-products")
    public List<Product> list_product(){
        ProductCalls agent = FeignBuilderFactory.createClient(ProductCalls.class,"http://localhost:8082/products");

        List<Product> response = agent.list_products();
        return response;

    }

    @GetMapping("/calladd")
    public Product call_add(){
        ProductCalls agent = FeignBuilderFactory.createClient(ProductCalls.class,"http://localhost:8082/products");
        Product p = new Product();
        p.setLibelle("nokia 1025");
        p.setCategorie("Smartphone");
        Product response = agent.add_product(p);
        return response;
    }
}
