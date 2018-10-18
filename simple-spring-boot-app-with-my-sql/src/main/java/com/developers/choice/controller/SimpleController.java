/**
 * 
 */
package com.developers.choice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.developers.choice.bo.EmployeeService;
import com.developers.choice.model.Employee;

/**
 * @author Scorpio
 *
 */
@RestController
public class SimpleController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(name="employeeList", method=RequestMethod.GET)
	public List<Employee> getEmployeeDetails(){
		System.out.println("This is getEmployeeDetails() method");
		List<Employee> list = employeeService.getEmployeeDetails();
		return list;
	}
	
	@RequestMapping(name="saveEmployee", method=RequestMethod.POST)
	public List<Employee> saveEmployeeDetails(@RequestBody Employee employee){
		System.out.println("This is saveEmployeeDetails() method");
		List<Employee> list = employeeService.saveEmployeeDetails(employee);
		return list;
	}
}
