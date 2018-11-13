package com.seesawin.service;

import org.springframework.stereotype.Component;

@Component
public class MyService {

	public String setName(String name) throws Exception {
		try {
			System.out.println("setName is : " + name);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return "Say Hi " + name + "!";
	}
}
