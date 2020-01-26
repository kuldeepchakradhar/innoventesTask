package com.innoventes.org.InnoventesApi.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innoventes.org.InnoventesApi.Entity.Employee;
import com.innoventes.org.InnoventesApi.Repository.EmployeeRepository;
import com.innoventes.org.InnoventesApi.Service.EmployeeService;

import javassist.NotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee createEmployee(Employee employee) {
		
		Employee emp = employeeRepository.save(employee);
		
		return emp ;
	}
	
	@Override
	public Employee findByEmployeeId(Long id) throws NotFoundException {
		
		Employee employee = employeeRepository.findEmployeeById(id);
		
		if(employee == null) throw new NotFoundException("Employee id is Not found");
		
		return employee;
	}
	

	@Override
	public Employee updateEmployee(Long id, Employee employee) throws NotFoundException {
		
		Employee emp = findByEmployeeId(id);

		emp.setName(employee.getName());
		emp.setDateOfBirth(employee.getDateOfBirth());
		
		employeeRepository.save(emp);
		return emp;
	}

	@Override
	public List<Employee> getAll() {
	
		List<Employee> lists = (List<Employee>) employeeRepository.findAll();
		
		return lists;
	}
	
		


	
}
