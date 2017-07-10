package com.spring22.demo.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonSetter;
public class Employee {


	private int id;

	private String name[];
	
	public Employee() {
		
	}

	public Employee(int id, String[] name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	//to spring the json values in output this annoation will require @JsonSetter("id")

	
	public void setId(int id) {
		this.id = id;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + Arrays.toString(name) + "]";
	}

}
