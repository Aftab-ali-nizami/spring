package org.jsp.springpractice.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("baby.xml");
		Baby b=context.getBean(Baby.class,"baby");
		b.getIceCream().eat();
	}

}
