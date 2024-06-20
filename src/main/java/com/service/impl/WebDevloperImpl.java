package com.service.impl;

import com.model.Employee;
import com.service.EmployeeService;

public class WebDevloperImpl implements EmployeeService {

	@Override
	public Employee getEmployee() {

		Employee emp = new Employee();
		emp.setId(101L);
		emp.setName("Ansih");
		emp.setSalary(10101);
		emp.setType("Web Developer");
		return emp;
	}

}
