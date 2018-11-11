package com.neo.controller;

import com.neo.dao.UserDao;
import com.neo.entity.UserEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static final Logger log = LogManager.getLogger(UserController.class);
    @Autowired
    private UserDao userDao;
    @PostMapping("/insert")
    public void insert(UserEntity userEntity){
        userDao.saveUser(userEntity);
        log.info("添加User：" + userEntity.toString());
    }
}
