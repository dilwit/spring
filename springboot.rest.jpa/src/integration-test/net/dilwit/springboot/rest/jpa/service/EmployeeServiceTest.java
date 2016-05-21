package net.dilwit.springboot.rest.jpa.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import net.dilwit.springboot.rest.jpa.integration.BackendIntegrationTest;
import net.dilwit.springboot.rest.jpa.unit.builder.EmployeeBuilder;

public class EmployeeServiceTest extends BackendIntegrationTest {

	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void createNewDepartment() {		
		EmployeeBuilder employeeBuilder = new EmployeeBuilder();
		employeeBuilder.withBasicDetails("Dil", "Wit")
		.withDepartment(1)
		.withLogin("dilwit", "123");
		
		employeeService.createOrUpdate(employeeBuilder.build());
	}
}
