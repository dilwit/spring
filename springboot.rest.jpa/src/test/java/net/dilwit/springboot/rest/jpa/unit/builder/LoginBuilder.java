package net.dilwit.springboot.rest.jpa.unit.builder;

import net.dilwit.springboot.rest.jpa.model.Employee;
import net.dilwit.springboot.rest.jpa.model.Login;

public class LoginBuilder {

	private Login login = new Login();
	
	public LoginBuilder withCredentials(String... credentials) {
		login.setUsername(credentials[0]);
		login.setPassword(credentials[1]);
		return this;
	}
	
//	public LoginBuilder withEmployee(Employee employee) {
//		login.setEmployee(employee);
//		return this;
//	}	
	
	public Login build() {
		return login;
	}
}
