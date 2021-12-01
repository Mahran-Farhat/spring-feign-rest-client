package com.funsoft.feignrestclient.controller;

import com.funsoft.feignrestclient.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductRest {

    @GetMapping("/products/{id}")
    public Product get_product(@PathVariable("id") long id){
        Product p = new Product();
        p.setId(id);
        p.setCategorie("cat 1");
        p.setLibelle("biscuit");
        return p;
    }

    @PostMapping("/products")
    public Product add_product(@RequestBody Product product){
        product.setId(1);
        return product;
    }

    @GetMapping("/products")
    public List<Product> list_products(){

        List<Product> list  = new ArrayList<>();
        list.add(new Product(1,"lib 1","cat 1"));
        list.add(new Product(2,"lib 2","cat 2"));
        return list;

    }
}
