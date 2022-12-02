package com.humanresource.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanresource.exception.EmployeeException;
import com.humanresource.model.Employee;
import com.humanresource.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository eRepository;

	@Override
	public Employee addEmployee(Employee employee) {

		return eRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() throws EmployeeException {
		
		List<Employee> employees = eRepository.findAll();
		
		if(employees.size()==0) {
			throw new EmployeeException("No Employees Available");
		}
		
		return employees;
	}

	@Override
	public Employee getEmployeeById(Long id) throws EmployeeException {

		Optional<Employee> optional = eRepository.findById(id);
		
		if (optional.isEmpty()) {
			throw new EmployeeException("No Employee Exists With Given Id : "+id);
		}
		
		return optional.get();
	}

	@Override
	public Employee deleteEmployee(Long id) throws EmployeeException {
	Employee employee = eRepository.findById(id).get();
		
		if (employee == null) {
			throw new EmployeeException("No Employee Exists With Given Id : "+id);
		}
		
		eRepository.delete(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee e) throws EmployeeException {
		
		Optional<Employee> optional = eRepository.findById(e.getId());
		
		if(optional.isEmpty()) {
			throw new EmployeeException("No Employee Exists With Given Id : "+e.getId());
		}
		
		
		
		return eRepository.save(e);
	}

}
