package net.dilwit.springboot.rest.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import net.dilwit.springboot.rest.jpa.model.Department;

@Service
public class DepartmentServiceImpl extends BasicServiceOperationsImpl<Department> implements DepartmentService {
	
	@Autowired
	@Qualifier(value="departmentRepo")
	private JpaRepository<Department, Integer> repo;

	@Override
	protected JpaRepository<Department, Integer> getRepo() {
		return repo;
	}
}
