package zs.frontline.frontlinedidemo.services;

import org.springframework.stereotype.Component;

@Component
public class SomeClassExtendsAbstract extends SomeAbstractClass {

	@Override
	public String sayGreeting() {
		return "Hello from abstractClass now";
	}

	@Override
	public Integer add(Integer... integers) {

		Integer answer = integers[0] + integers[1];

		return answer;
	}
}
