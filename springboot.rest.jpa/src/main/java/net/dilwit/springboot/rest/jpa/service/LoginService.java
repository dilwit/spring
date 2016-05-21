package net.dilwit.springboot.rest.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

import net.dilwit.springboot.rest.jpa.model.Login;

public class LoginService extends BasicServiceOperationsImpl<Login> {
	
	@Autowired
	@Qualifier(value="loginRepo")
	private JpaRepository<Login, Integer> repo;

	@Override
	protected JpaRepository<Login, Integer> getRepo() {
		return repo;
	}
}
