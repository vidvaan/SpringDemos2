package com.ciq.dao;

import com.ciq.bean.Employee;

public class EmployeeDAO {
	public void save(Employee employee) {
		System.out.println("Employee DAO Start");
		System.out.println(employee + " Saved into DB");
		System.out.println("Employee DAO End");
	}
}
