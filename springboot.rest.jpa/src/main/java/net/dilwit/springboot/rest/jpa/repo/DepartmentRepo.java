package net.dilwit.springboot.rest.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.dilwit.springboot.rest.jpa.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
