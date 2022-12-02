package com.humanresource.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.humanresource.exception.EmployeeException;
import com.humanresource.model.Employee;
import com.humanresource.service.EmployeeService;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/humanresource")
public class EmployeeController {

	@Autowired
	private EmployeeService eService;

	@PostMapping("/employees")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) throws EmployeeException {
		return new ResponseEntity<Employee>(eService.addEmployee(employee), HttpStatus.ACCEPTED);
	}

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> showAllEmployees() throws EmployeeException {
		return new ResponseEntity<List<Employee>>(eService.getAllEmployee(), HttpStatus.OK);
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<Employee, Boolean>> deleteEmployee(@PathVariable("id") Long id) throws EmployeeException {

		boolean deleted = false;
		Employee deletedEmployee = eService.deleteEmployee(id);
		if (deletedEmployee != null) {
			deleted = true;
		}
		Map<Employee, Boolean> response = new HashMap<>();
		response.put(deletedEmployee, deleted);
		return new ResponseEntity<Map<Employee, Boolean>>(response, HttpStatus.OK);
	}
	
	@PutMapping("/employees")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee e) throws EmployeeException{
		
		Employee updatedEmployee = eService.updateEmployee(e);
		
		return new ResponseEntity<Employee>(updatedEmployee,HttpStatus.ACCEPTED);
	}

}
