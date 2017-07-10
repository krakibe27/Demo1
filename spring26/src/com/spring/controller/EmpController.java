package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.employeeDao.EmployeeDao;
import com.spring.model.Employee;

@RestController
public class EmpController {
	
	@Autowired
	private EmployeeDao dao;
	
	@RequestMapping("/")
	public String showHome() {
		return "Welcome to Employee Registration";
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getList() {
		return dao.getAllEmployees();
	}
	
}
