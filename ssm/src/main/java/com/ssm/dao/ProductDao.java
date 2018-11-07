package com.ssm.dao;

import com.ssm.entry.Product;
import com.ssm.entry.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {

    List<Product> list();

    void create(Product product);

}

