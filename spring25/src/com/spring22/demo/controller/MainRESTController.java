package com.spring22.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring22.demo.dao.EmployeeDAO;
import com.spring22.demo.model.Employee;

@RestController
public class MainRESTController {

	
	private EmployeeDAO dao;
	
	
	@Autowired
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}


	@RequestMapping("/")
	public String welcomePage() {
		return "Welcome To The Registration Page";
	}
 	 
	@RequestMapping(value = "emp/all", method=RequestMethod.GET,produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Employee> getList() {
		List<Employee> e = dao.getList();
		return e;
	}
	
	@RequestMapping(value= "emp/add", method=RequestMethod.POST, consumes={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Employee addEmployee(Employee e) {
		return dao.addEmployee(e);
	}
	
	@RequestMapping(value= "emp/find/{empNo}", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeById(@PathVariable("empNo") String empNo) {
		return dao.getEmployee(empNo);
	}
	
	@RequestMapping(value="emp/{empNo}", method=RequestMethod.DELETE)
	public String delete(@PathVariable("empNo") String empNo) {
		dao.deleteEmployee(empNo);
		return "User Deleted";
	}
}
