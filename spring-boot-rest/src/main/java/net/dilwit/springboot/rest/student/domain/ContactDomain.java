package net.dilwit.springboot.rest.student.domain;

import java.util.List;

/**
 * 
 * @author DWithanage
 *
 */
public class ContactDomain implements Contact {
	
	private List<Telephone> telephone;
	private Address address;
	
	public List<Telephone> getTelephone() {
		return telephone;
	}
	public void setTelephone(List<Telephone> telephone) {
		this.telephone = telephone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}	
}
