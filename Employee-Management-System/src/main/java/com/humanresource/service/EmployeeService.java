package com.humanresource.service;

import java.util.List;
import java.util.Map;

import javax.persistence.Id;

import com.humanresource.exception.EmployeeException;
import com.humanresource.model.Employee;

public interface EmployeeService {

	/**
	 * Create a new employee and save it to database.
	 * @param employee new employee to be created
	 * @return Employee newly created employee
	 * @throws EmployeeException if employee is already available
	 */
	Employee addEmployee(Employee employee) throws EmployeeException;


	/**
	 * Fetch all the employee details available
	 * @return List<Employee> containing list of all employees
	 * @throws EmployeeException if no employee is available
	 */
	List<Employee> getAllEmployee() throws EmployeeException;


	/**
	 * Fetch an employee details by employee id
	 * @param id employee id to identify employee data from database
	 * @return Employee fetched from database
	 * @throws EmployeeException employee is not available with given id or no employees available
	 */
	Employee getEmployeeById(Long id) throws EmployeeException;


	/**
	 * Delete employee details for given employee id
	 * @param id employee id to identify employee data from database
	 * @return Employee deleted employee details
	 * @throws EmployeeException employee is not available with given id or no employees available
	 */
	Employee deleteEmployee(Long id) throws EmployeeException;


	/**
	 * Update employee details
	 * @param e employee details to be updated .a valid employeeId is mandatory for this method
	 * @return Employee updated employee
	 * @throws EmployeeException employee is not available with given id or no employees available
	 */
	Employee updateEmployee(Employee e) throws EmployeeException;

}
