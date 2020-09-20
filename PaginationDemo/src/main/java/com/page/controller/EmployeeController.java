package com.page.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;

import com.page.model.Employee;
import com.page.repo.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeData;
	
	Page<Employee> employeePageable(Pageable pageable){
		return employeeData.findAll(pageable);
	}
}
