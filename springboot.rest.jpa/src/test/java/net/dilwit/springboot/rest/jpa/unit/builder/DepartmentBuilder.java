package net.dilwit.springboot.rest.jpa.unit.builder;

import net.dilwit.springboot.rest.jpa.model.Department;

public class DepartmentBuilder {

	private Department department = new Department();
	
	public DepartmentBuilder withGivenId(int id) {
		department.setId(id);
		return this;
	}
	
	public DepartmentBuilder withName(String name) {
		department.setName(name);
		return this;
	}
	
	public Department build() {
		return department;
	}
}
