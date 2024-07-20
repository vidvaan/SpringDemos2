package com.ciq.service;

import com.ciq.bean.Employee;
import com.ciq.dao.EmployeeDAO;

public class EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}



	public void save(Employee employee) {
		 System.out.println("Employee Service Start");
		 employeeDAO.save(employee);
		 System.out.println("Employee Service End");
	 }

}
