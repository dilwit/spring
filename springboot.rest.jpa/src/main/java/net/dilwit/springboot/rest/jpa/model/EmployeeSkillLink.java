package net.dilwit.springboot.rest.jpa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee_skill_link database table.
 * 
 */
@Entity
@Table(name="employee_skill_link")
@NamedQuery(name="EmployeeSkillLink.findAll", query="SELECT e FROM EmployeeSkillLink e")
public class EmployeeSkillLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	private int years_Of_Experience;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	private Employee employee;

	//bi-directional many-to-one association to Skill
	@ManyToOne
	private Skill skill;

	public EmployeeSkillLink() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYears_Of_Experience() {
		return this.years_Of_Experience;
	}

	public void setYears_Of_Experience(int years_Of_Experience) {
		this.years_Of_Experience = years_Of_Experience;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Skill getSkill() {
		return this.skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

}