package net.dilwit.springboot.rest.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created_At;

	private String first_Name;

	private String last_Name;

	@Temporal(TemporalType.TIMESTAMP)
	private Date last_Updated_At;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="Department_Id")
	private Department department;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="Manager_Id")
	private Employee manager;

	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="manager")
	private List<Employee> employees;

	//bi-directional many-to-one association to Login
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Login_Id")
	private Login login;

	//bi-directional many-to-one association to EmployeeMentorLink
	@OneToMany(mappedBy="mentor")
	private List<EmployeeMentorLink> mentors;

	//bi-directional many-to-one association to EmployeeMentorLink
	@OneToMany(mappedBy="mentee")
	private List<EmployeeMentorLink> mentees;

	//bi-directional many-to-one association to EmployeeSkillLink
	@OneToMany(mappedBy="employee")
	private List<EmployeeSkillLink> employeeSkillLinks;

	public Employee() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreated_At() {
		return this.created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public String getFirst_Name() {
		return this.first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return this.last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public Date getLast_Updated_At() {
		return this.last_Updated_At;
	}

	public void setLast_Updated_At(Date last_Updated_At) {
		this.last_Updated_At = last_Updated_At;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setManager(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setManager(null);

		return employee;
	}

	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public List<EmployeeMentorLink> getMentors() {
		return mentors;
	}

	public void setMentors(List<EmployeeMentorLink> mentors) {
		this.mentors = mentors;
	}

	public List<EmployeeMentorLink> getMentees() {
		return mentees;
	}

	public void setMentees(List<EmployeeMentorLink> mentees) {
		this.mentees = mentees;
	}

	public EmployeeMentorLink addMentors(EmployeeMentorLink Mentors) {
		getMentors().add(Mentors);
		Mentors.setMentor(this);

		return Mentors;
	}

	public EmployeeMentorLink removeMentors(EmployeeMentorLink Mentors) {
		getMentors().remove(Mentors);
		Mentors.setMentor(null);

		return Mentors;
	}

	public EmployeeMentorLink addMentee(EmployeeMentorLink mentee) {
		getMentees().add(mentee);
		mentee.setMentee(this);

		return mentee;
	}

	public EmployeeMentorLink removeMentee(EmployeeMentorLink mentee) {
		getMentees().remove(mentee);
		mentee.setMentee(null);

		return mentee;
	}

	public List<EmployeeSkillLink> getEmployeeSkillLinks() {
		return this.employeeSkillLinks;
	}

	public void setEmployeeSkillLinks(List<EmployeeSkillLink> employeeSkillLinks) {
		this.employeeSkillLinks = employeeSkillLinks;
	}

	public EmployeeSkillLink addEmployeeSkillLink(EmployeeSkillLink employeeSkillLink) {
		getEmployeeSkillLinks().add(employeeSkillLink);
		employeeSkillLink.setEmployee(this);

		return employeeSkillLink;
	}

	public EmployeeSkillLink removeEmployeeSkillLink(EmployeeSkillLink employeeSkillLink) {
		getEmployeeSkillLinks().remove(employeeSkillLink);
		employeeSkillLink.setEmployee(null);

		return employeeSkillLink;
	}

}