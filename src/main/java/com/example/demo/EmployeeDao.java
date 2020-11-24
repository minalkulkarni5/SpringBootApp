package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Long>{

	public void updateSalary(String place, int percentage);
	
	public List<Employee> getEmployees(String place);
	
	public List<String> listSalaries(String competency);
}
