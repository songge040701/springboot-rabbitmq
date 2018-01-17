package com.songge.mqdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.songge.mqdemo.function.HelloSender;

@RestController
public class RabbitMqHelloTest {
	
	@Autowired
	HelloSender helloSender;

	@RequestMapping("/rabbitmq_test")
	public String rabbitmq_test() {
		for(int i = 0; i < 10; i++) {
			helloSender.send(i, "songge");
		}
		return "";
	}
}
