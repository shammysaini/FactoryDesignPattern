package com.service.impl;

import org.springframework.stereotype.Service;

import com.model.Employee;
import com.service.EmployeeService;

@Service
public class AndroidDeveloperImpl implements EmployeeService {

	@Override
	public Employee getEmployee() {
		
		Employee emp = new Employee();
		emp.setId(102L);
		emp.setName("sunny");
		emp.setSalary(20000);
		emp.setType("Android Developer");
		return emp;
	}

}
