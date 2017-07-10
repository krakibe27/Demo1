package com.spring22.demo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring22.demo.model.Employee;

@Repository
public class EmployeeDAO {

	private static final Map<String, Employee> map = new HashMap<>();
	
	static {
		init();
	}
	
	public Employee getEmployee(String empNo) {
		Employee e = map.get(empNo);
		return e;
	}
	
	public Employee addEmployee(Employee emp) {
		return map.put(emp.getEmpNo(), emp);
	}
	
	public Employee updateEmployee(Employee emp) {
		map.put(emp.getEmpNo(), emp);
		return emp;
	}
	
	public void deleteEmployee(String empNo) {
		map.remove(empNo);
	}
	
	public List<Employee> getList() {
		Collection<Employee> list = map.values();
		List<Employee> l1 = new ArrayList<>();
		l1.addAll(list);
		return l1;
	}
	
	private static void init() {
		 Employee emp1 = new Employee("E01", "Smith", "Clerk");
	     Employee emp2 = new Employee("E02", "Allen", "Salesman");
	     Employee emp3 = new Employee("E03", "Jones", "Manager");
	     
	     map.put(emp1.getEmpNo(), emp1);
	     map.put(emp2.getEmpNo(), emp2);
	     map.put(emp3.getEmpNo(), emp3);
	     
	}
	
}
