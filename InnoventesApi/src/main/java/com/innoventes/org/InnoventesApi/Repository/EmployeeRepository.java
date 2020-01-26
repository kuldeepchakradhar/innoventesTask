package com.innoventes.org.InnoventesApi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.innoventes.org.InnoventesApi.Entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	Employee findEmployeeById(Long id);


}
