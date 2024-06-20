package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.factory.EmployeeFactory;
import com.model.Employee;
import com.service.EmployeeService;

@org.springframework.web.bind.annotation.RestController
public class RestController{
	
	RestController(EmployeeFactory employeeFactory)
	{
		this.employeeFactory = employeeFactory;
	}
	
	@Autowired
	private final EmployeeFactory employeeFactory; 
	
@GetMapping("/employee/{web}")
public EmployeeService helloEmployee(@PathVariable("web") String type) {
		EmployeeService employeeService = employeeFactory.fetchEmployee(type);
		return employeeService;

	}

}
