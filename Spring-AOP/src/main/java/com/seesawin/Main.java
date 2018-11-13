package com.seesawin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seesawin.service.MyService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application-context-annotation.xml" });

		// get bean from Spring context container
		MyService myService = (MyService) context.getBean(MyService.class);
		try {
			myService.setName("Qoo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
