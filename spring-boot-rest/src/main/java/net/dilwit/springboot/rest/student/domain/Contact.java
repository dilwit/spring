package net.dilwit.springboot.rest.student.domain;

import java.util.List;

public interface Contact {
	
	List<Telephone> getTelephone();
	void setTelephone(List<Telephone> telephone);
	Address getAddress();
	void setAddress(Address address);

}
