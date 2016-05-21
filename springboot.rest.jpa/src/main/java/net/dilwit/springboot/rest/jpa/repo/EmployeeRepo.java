package net.dilwit.springboot.rest.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.dilwit.springboot.rest.jpa.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
