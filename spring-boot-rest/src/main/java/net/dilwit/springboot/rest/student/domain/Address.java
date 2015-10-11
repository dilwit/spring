package net.dilwit.springboot.rest.student.domain;

/**
 * 
 * @author DWithanage
 *
 */
public interface Address {
	
	String getStreetAddress();
	void setStreetAddress(String streetAddress);
	String getCity();
	void setCity(String city);
	String getState();
	void setState(String state);
	String getPostcode();
	void setPostcode(String postcode);
}
