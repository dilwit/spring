package net.dilwit.springboot.rest.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the skill database table.
 * 
 */
@Entity
@NamedQuery(name="Skill.findAll", query="SELECT s FROM Skill s")
public class Skill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	private String category;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created_At;

	@Temporal(TemporalType.TIMESTAMP)
	private Date last_Updated_At;

	private String name;

	//bi-directional many-to-one association to EmployeeSkillLink
	@OneToMany(mappedBy="skill")
	private List<EmployeeSkillLink> employeeSkillLinks;

	public Skill() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getCreated_At() {
		return this.created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public Date getLast_Updated_At() {
		return this.last_Updated_At;
	}

	public void setLast_Updated_At(Date last_Updated_At) {
		this.last_Updated_At = last_Updated_At;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<EmployeeSkillLink> getEmployeeSkillLinks() {
		return this.employeeSkillLinks;
	}

	public void setEmployeeSkillLinks(List<EmployeeSkillLink> employeeSkillLinks) {
		this.employeeSkillLinks = employeeSkillLinks;
	}

	public EmployeeSkillLink addEmployeeSkillLink(EmployeeSkillLink employeeSkillLink) {
		getEmployeeSkillLinks().add(employeeSkillLink);
		employeeSkillLink.setSkill(this);

		return employeeSkillLink;
	}

	public EmployeeSkillLink removeEmployeeSkillLink(EmployeeSkillLink employeeSkillLink) {
		getEmployeeSkillLinks().remove(employeeSkillLink);
		employeeSkillLink.setSkill(null);

		return employeeSkillLink;
	}

}