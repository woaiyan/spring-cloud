package com.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	@Autowired
	private Sender sender;
	@Autowired
    @RequestMapping("/hello")
    public String index() {
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
        sender.send();
        return "Hello World";
    }
}