package com.seesawin.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Service2")
public class Service2 {

	@Autowired
	Dao dao;

	public String getName() {
		return dao.getName();
	}

}
