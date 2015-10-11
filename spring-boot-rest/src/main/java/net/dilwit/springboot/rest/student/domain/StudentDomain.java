package net.dilwit.springboot.rest.student.domain;

/**
 * 
 * @author DWithanage
 *
 */
public class StudentDomain implements Student {
	
	private int id;
	private String firstName;
	private String lastName;
	//private Contact contact;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
//	public Contact getContact() {
//		return contact;
//	}
//	public void setContact(Contact contact) {
//		this.contact = contact;
//	}
	
}
