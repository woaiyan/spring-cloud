package com.message;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	@Autowired
	private AmqpTemplate rabbitTemplate;
	public void send(){
        System.out.println("Sender-------------------------------------------------------------------------------- : " + "queue1");
        System.out.println("Sender-------------------------------------------------------------------------------- : " + "queue1");
        System.out.println("Sender-------------------------------------------------------------------------------- : " + "queue1");
        System.out.println("Sender-------------------------------------------------------------------------------- : " + "queue1");
        System.out.println("Sender-------------------------------------------------------------------------------- : " + "queue1");
        System.out.println("Sender-------------------------------------------------------------------------------- : " + "queue1");
        System.out.println("Sender-------------------------------------------------------------------------------- : " + "queue1");
		String  context = "queue1 " + new Date();
		System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("queue1", context);
    }
}
