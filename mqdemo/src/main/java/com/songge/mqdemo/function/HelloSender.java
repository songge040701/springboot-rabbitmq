package com.songge.mqdemo.function;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.songge.mqdemo.data.RpcData;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int id, String name) {
    	RpcData rpcData = new RpcData();
    	rpcData.setId(id);
    	rpcData.setName(name);
    	rpcData.setDate(new Date());
        this.rabbitTemplate.convertAndSend("hello", rpcData);
    }

}