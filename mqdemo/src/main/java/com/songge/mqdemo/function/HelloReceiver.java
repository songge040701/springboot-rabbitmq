package com.songge.mqdemo.function;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.songge.mqdemo.data.RpcData;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(RpcData hello) {
        System.out.println("Receiver  : " + hello.getId());
    }

}