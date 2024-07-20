package com.ciq.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");
		HelloWorldBean helloWorldBean = (HelloWorldBean) applicationContext.getBean("helloWorld");
		helloWorldBean.sayHello();
		
		WelcomeBean welcomeBean = (WelcomeBean) applicationContext.getBean("welcome");
		welcomeBean.syaWelcome();
	}
}
