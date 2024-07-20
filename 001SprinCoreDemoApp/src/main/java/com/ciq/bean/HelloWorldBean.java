package com.ciq.bean;

public class HelloWorldBean {

	private String fname;
	private String lname;

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void sayHello() {
		System.out.println("Hello "+fname+" "+lname);
	}

}
