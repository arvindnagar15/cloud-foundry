package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.Employee;
import com.example.demo.bo.EmployeeService;

@RestController
public class MyController {

	@Autowired
	public EmployeeService employeeService; 
	@RequestMapping(name="/employeeList", method=RequestMethod.GET)
	public List<Employee> getEmployeeList(){
		List<Employee> list = employeeService.getList();
		return list;
	}
	
	@RequestMapping(name="/addEmployee", method=RequestMethod.POST)
	public List<Employee> addEmployeeList(@RequestBody List<Employee> employeeList){
		List<Employee> list = employeeService.addIntoEmployeeList(employeeList);
		return list;
	}
}
