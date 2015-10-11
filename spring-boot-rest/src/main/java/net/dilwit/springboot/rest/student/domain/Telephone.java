package net.dilwit.springboot.rest.student.domain;

/**
 * 
 * @author DWithanage
 *
 */
public interface Telephone {	
	
	TelephoneType getType();
	void setType(TelephoneType type) ;
	String getNumber();
	void setNumber(String number);

}
