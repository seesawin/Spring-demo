package com.seesawin.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Service1")
public class Service1 {
	
	@Autowired
    public Service1(Dao dao) {
        this.dao = dao;
    }
	
	Dao dao;
	
	public String getName() {
		return dao.getName();
	}

}
