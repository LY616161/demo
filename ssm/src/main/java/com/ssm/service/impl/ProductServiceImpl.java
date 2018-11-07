package com.ssm.service.impl;

import com.ssm.dao.ProductDao;
import com.ssm.entry.Product;
import com.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> list() {
        return productDao.list();
    }

    @Override
    public void create(Product product) {
        productDao.create(product);
    }
}
