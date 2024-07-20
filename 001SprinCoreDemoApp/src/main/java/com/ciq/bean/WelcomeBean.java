package com.ciq.bean;

public class WelcomeBean {
	private String fname;
	private String lname;

	public WelcomeBean(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public void syaWelcome() {
		System.out.println("Welcome "+fname+" "+lname);
	}

}
