package com.innoventes.org.InnoventesApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innoventes.org.InnoventesApi.Entity.Employee;
import com.innoventes.org.InnoventesApi.Service.EmployeeService;

import javassist.NotFoundException;

@RestController
@RequestMapping(value="employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("/add")
	public ResponseEntity<Employee> add(@RequestBody Employee employee) throws Exception{
		 
		if(employee.getName() == "") throw new NotFoundException("Field name can not be empty");
		
		Employee emp = employeeService.createEmployee(employee);
		
		
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public Employee update(@PathVariable Long id, @RequestBody Employee employee) throws NotFoundException {
		
		Employee employe = employeeService.updateEmployee(id, employee);
		
		return employe;
	}
	
	@GetMapping("/all")
	public List<Employee> getAll(){
		
		List<Employee> lists = employeeService.getAll();
		
		return lists;
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable Long id) throws NotFoundException
	{
		Employee employee = employeeService.findByEmployeeId(id);
		return employee;
	}
	
	
}
