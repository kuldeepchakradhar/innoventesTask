package com.innoventes.org.InnoventesApi.Service;

import java.util.List;

import com.innoventes.org.InnoventesApi.Entity.Employee;

import javassist.NotFoundException;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	Employee updateEmployee(Long id, Employee employee) throws NotFoundException;
	
	Employee findByEmployeeId(Long id) throws NotFoundException;

	List<Employee> getAll();

}
