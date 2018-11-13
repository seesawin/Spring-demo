package com.seesawin.xml;

public class Service1 {
	private Dao dao;
	
	public Service1(Dao dao) {
		this.dao = dao;
	}

	public String getName() {
		return dao.getName();
	}
	
}
