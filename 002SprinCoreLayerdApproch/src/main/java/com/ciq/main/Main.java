package com.ciq.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.Employee;
import com.ciq.controller.EmployeeController;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");		
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		employeeController.save(new Employee(1, "Balaji"));
	}

}
