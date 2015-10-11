package net.dilwit.springboot.rest.student.domain;

/**
 * 
 * @author DWithanage
 *
 */
public class TelephoneDomain implements Telephone {
	
	private TelephoneType type;
	private String number;
	
	public TelephoneType getType() {
		return type;
	}
	public void setType(TelephoneType type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}	
}
