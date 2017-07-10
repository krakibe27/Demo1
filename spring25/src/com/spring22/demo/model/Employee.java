package com.spring22.demo.model;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Employee {


	private String empNo;
	private String empName;
	private String position;
	
	public Employee() {
		
	}
	
	public Employee(String empNo, String empName, String position) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.position = position;
	}

	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", position=" + position + "]";
	}
}
