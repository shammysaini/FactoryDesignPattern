package com.factory;

import org.springframework.stereotype.Service;

import com.service.EmployeeService;
import com.service.impl.AndroidDeveloperImpl;
import com.service.impl.WebDevloperImpl;

@Service
public class EmployeeFactory {

	public EmployeeService fetchEmployee(String type) {

		if (type.trim().equalsIgnoreCase("Web")) {

			return new WebDevloperImpl();

		} else if (type.trim().equalsIgnoreCase("Android")) {

			return new AndroidDeveloperImpl();

		} else {

			return null;

		}

	}

}
