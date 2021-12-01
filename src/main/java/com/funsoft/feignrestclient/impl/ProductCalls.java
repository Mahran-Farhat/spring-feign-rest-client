package com.funsoft.feignrestclient.impl;

import com.funsoft.feignrestclient.model.Product;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

@Headers("Accept: application/json")
public interface ProductCalls {

    @RequestLine("POST ")
    @Headers({ "Content-Type: application/json" })
    Product add_product(Product product);

    @RequestLine("GET ")
    List<Product> list_products();

    @RequestLine("GET /{id}")
    Product get_product(@Param("id") long id);

    @RequestLine("PUT /{id}")
    @Headers({ "Content-Type: application/json" })
    Product update_product(@Param("id") long id,Product product);

    @RequestLine("DELETE /{id}")
    @Headers({ "Content-Type: application/json" })
    Product delete_product(@Param("id") long id);
}
