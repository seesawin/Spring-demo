package com.seesawin.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application-context-annotation.xml" });
		MyBean myBean = (MyBean) context.getBean(MyBean.class);
		String name = myBean.getName();
		System.out.println("name:" + name);
	}

}
