package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/employee/{competency}")
	public List<String> listSalaries(@PathVariable String competency) {
		
		return employeeService.listSalaries(competency);
	}	
	
	@RequestMapping(method = RequestMethod.GET, path = "/employee/{place}")
	public List<Employee> getEmployees(@PathVariable String place) {
		return employeeService.getEmployees(place);
	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "/employee/place/{place}/salary/{percentage}")
	public void updateSalary(@PathVariable String place, @PathVariable int percentage) {
		employeeService.updateSalary(place, percentage);
	}
	
}
