package net.dilwit.springboot.rest.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.dilwit.springboot.rest.jpa.model.Login;

public interface LoginRepo extends JpaRepository<Login, Integer> {

}
