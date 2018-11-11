package com.neo.dao.impl;

import com.neo.dao.LogDao;
import com.neo.entity.LogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class LogDaoImpl implements LogDao {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public void saveLog(LogEntity LogEntity) {
        mongoTemplate.save(LogEntity);
    }
}
