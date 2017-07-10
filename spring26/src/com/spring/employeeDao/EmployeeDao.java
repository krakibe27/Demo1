package com.spring.employeeDao;

import java.util.List;

import com.spring.model.Employee;

public interface EmployeeDao {

	public void addEmployee(Employee emp);
	public List<Employee> getAllEmployees();
	
}
