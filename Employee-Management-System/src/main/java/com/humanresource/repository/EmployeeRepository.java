package com.humanresource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.humanresource.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
