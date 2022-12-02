package com.humanresource.service;

import java.util.List;
import java.util.Map;

import javax.persistence.Id;

import com.humanresource.exception.EmployeeException;
import com.humanresource.model.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee) throws EmployeeException;

	List<Employee> getAllEmployee() throws EmployeeException;

	//Boolean removeEmployee(Long id) throws EmployeeException;
	
	Employee getEmployeeById(Long id) throws EmployeeException;
	
	Employee deleteEmployee(Long id) throws EmployeeException;
	
	Employee updateEmployee(Employee e) throws EmployeeException;

}
