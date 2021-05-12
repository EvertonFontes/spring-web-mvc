package com.efsoftware.springwebmvc.model;

public class Jedi {

	private String name;
	private String lastName;  
	
	public Jedi(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public Jedi() {}  

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
