package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> getEmployees(String place) {
		List<Employee> employees = new ArrayList<>();
		employeeDao.getEmployees(place).forEach(employees::add);
		return employees;
	}
	
	public List<String> listSalaries(String competency){
		List<String> salaries = new ArrayList<>();
		employeeDao.listSalaries(competency).forEach(salaries::add);
		return salaries;
	}
	
	public void updateSalary(String place, int percentage) {
		List<Employee> salaries = new ArrayList<>();
		List<Employee> employees = new ArrayList<>();
		employees = getEmployees(place);
		salaries = employees.stream().filter(e -> e.getPlace().equals(place)).collect(Collectors.toList());
		
		Optional<List<Employee>> emp = Optional.of(salaries);
		
		if (percentage <= 55) {
			if(emp.isPresent()) {
				Employee employee = (Employee) emp.get();
				employee.setSalary(employee.getSalary() + (employee.getSalary() * percentage));
			}	
		}
	}
}
