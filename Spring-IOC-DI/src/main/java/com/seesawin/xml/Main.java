package com.seesawin.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application-context.xml" });
		
		// get bean from Spring context container
		Service1 service1 = (Service1) context.getBean("Service1");
		String name1 = service1.getName();
		System.out.println("name1:" + name1);
		
		Service2 service2 = (Service2) context.getBean("Service2");
		String name2 = service2.getName();
		System.out.println("name2:" + name2);
	}

}
