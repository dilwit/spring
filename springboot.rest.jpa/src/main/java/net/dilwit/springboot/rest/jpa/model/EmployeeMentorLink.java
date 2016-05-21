package net.dilwit.springboot.rest.jpa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee_mentor_link database table.
 * 
 */
@Entity
@Table(name="employee_mentor_link")
@NamedQuery(name="EmployeeMentorLink.findAll", query="SELECT e FROM EmployeeMentorLink e")
public class EmployeeMentorLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="Mentor_Id")
	private Employee mentor;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="Mentee_Id")
	private Employee mentee;

	public EmployeeMentorLink() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getMentor() {
		return mentor;
	}

	public void setMentor(Employee mentor) {
		this.mentor = mentor;
	}

	public Employee getMentee() {
		return mentee;
	}

	public void setMentee(Employee mentee) {
		this.mentee = mentee;
	}	
}