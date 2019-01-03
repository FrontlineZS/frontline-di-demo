package zs.frontline.frontlinedidemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zs.frontline.frontlinedidemo.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingService greetingServiceImpl;

	public String sayHello(){
		return greetingServiceImpl.sayGreeting();
	}

}