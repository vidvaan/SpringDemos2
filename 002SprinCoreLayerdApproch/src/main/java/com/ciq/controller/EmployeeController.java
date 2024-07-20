package com.ciq.controller;

import com.ciq.bean.Employee;
import com.ciq.service.EmployeeService;

public class EmployeeController {
	
	  private EmployeeService employeeService;
	  
	  

	 public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}



	public void save(Employee employee) {
		 System.out.println("Employee Controller Start");
		 employeeService.save(employee);
		 System.out.println("Employee Controller End");
	 }
}
