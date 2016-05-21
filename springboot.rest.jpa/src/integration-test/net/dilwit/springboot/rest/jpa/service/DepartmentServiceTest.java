package net.dilwit.springboot.rest.jpa.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import net.dilwit.springboot.rest.jpa.integration.BackendIntegrationTest;
import net.dilwit.springboot.rest.jpa.unit.builder.DepartmentBuilder;

public class DepartmentServiceTest extends BackendIntegrationTest {

	@Autowired
	DepartmentService departmentService;
	
	@Test
	public void createNewDepartment() {
		DepartmentBuilder departmentBuilder = new DepartmentBuilder();
		departmentBuilder.withName("Finance");	
		
		departmentService.createOrUpdate(departmentBuilder.build());
	}
}
