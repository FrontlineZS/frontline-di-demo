package zs.frontline.frontlinedidemo.controllers;

import org.springframework.stereotype.Controller;
import zs.frontline.frontlinedidemo.services.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello(){
		System.out.println("Hello!!! ");

		return greetingService.sayGreeting();
	}
}