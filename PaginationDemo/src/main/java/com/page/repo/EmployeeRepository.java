package com.page.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.page.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
