package org.jsp.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRide {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("vehicle.xml");
		Ride r=context.getBean("myRide", Ride.class);
		r.getV().start();
	}

}
