package com.neo.controller;

import com.neo.dao.LogDao;
import com.neo.entity.LogEntity;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Receiver {
    @Autowired
    private LogDao logDao;

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(value = "log4j2Sample", type = ExchangeTypes.FANOUT),
            value = @org.springframework.amqp.rabbit.annotation.Queue))
    public void echoLogs(String logMessage) {
        System.out.println("在这里处理消费你的日志信息" + logMessage);
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        LogEntity logEntity = new LogEntity();
        logEntity.setId(uuid);
        logEntity.setMsg(logMessage);
        logDao.saveLog(logEntity);
    }
}
