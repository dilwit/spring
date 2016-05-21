package net.dilwit.springboot.rest.jpa.unit.builder;

import net.dilwit.springboot.rest.jpa.model.Employee;

public class EmployeeBuilder {
	
	private Employee employee = new Employee();
	private DepartmentBuilder departmentBuilder = new DepartmentBuilder();
	private LoginBuilder loginBuilder = new LoginBuilder();
	
	public EmployeeBuilder withBasicDetails(String... details) {
		employee.setFirst_Name(details[0]);
		employee.setLast_Name(details[1]);
		return this;
	}

	public EmployeeBuilder withDepartment(int id) {
		employee.setDepartment(departmentBuilder.withGivenId(id).build());
		return this;
	}

	public EmployeeBuilder withLogin(String... credentials) {
		employee.setLogin(
				loginBuilder.withCredentials(credentials).build());
		return this;
	}
	
	public Employee build() {
		return employee;
	}
}
