package com.ssm.service;

import com.ssm.entry.Product;

import java.util.List;

public interface ProductService {
    List<Product> list();

    void create(Product product);
}
