package com.seesawin.xml;

public class Service2 {
	private Dao dao;
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	public String getName() {
		return dao.getName();
	}
	
}
