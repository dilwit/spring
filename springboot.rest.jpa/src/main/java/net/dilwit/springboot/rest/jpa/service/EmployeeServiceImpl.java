package net.dilwit.springboot.rest.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import net.dilwit.springboot.rest.jpa.model.Employee;

@Service
public class EmployeeServiceImpl  extends BasicServiceOperationsImpl<Employee> implements EmployeeService {
	
	@Autowired
	@Qualifier(value="employeeRepo")
	private JpaRepository<Employee, Integer> repo;

	@Override
	protected JpaRepository<Employee, Integer> getRepo() {
		return repo;
	}
}
