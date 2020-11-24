package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	private int employeeId;
	
	@Column(name = "EMPLOYEE_NAME")
	private String employeeName;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "BUSINESS_UNIT")
	private String businessUnit;
	
	@Column(name = "PLACE")
	private String place;
	
	@Column(name = "SUPERVISOR_ID")
	private int supervisorId;
	
	@Column(name = "COMPETENCIES")
	private String competencies;
	
	@Column(name = "SALARY")
	private int salary;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getCompetencies() {
		return competencies;
	}

	public void setCompetencies(String competencies) {
		this.competencies = competencies;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
