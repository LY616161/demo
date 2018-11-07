package com.ssm.controller;

import com.ssm.entry.Product;
import com.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> list(){
        Map map = new HashMap();
        List<Product> list = productService.list();
        map.put("tableData",list);
        return map;
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public void create(Product product){
        productService.create(product);
    }
}
