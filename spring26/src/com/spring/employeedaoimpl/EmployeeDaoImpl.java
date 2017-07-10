package com.spring.employeedaoimpl;

import java.util.ArrayList;
import java.util.List;

import com.spring.employeeDao.EmployeeDao;
import com.spring.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private static List<Employee> list = new ArrayList<>();

	public EmployeeDaoImpl() {
		
		Employee e1 = new Employee("EC01","Ron","Brown");
		Employee e2 = new Employee("EC02","James","Sus");
		Employee e3 = new Employee("EC03","Wiz","Danny");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return list;
	}
	
	
	
}
