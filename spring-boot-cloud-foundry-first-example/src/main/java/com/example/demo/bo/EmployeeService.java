/**
 * 
 */
package com.example.demo.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;

/**
 * @author Scorpio
 *
 */
@Service
public class EmployeeService {

	public List<Employee> getList(){
		List<Employee> list = new ArrayList<>();
		Employee employee = new Employee();
		employee.setName("Arvind");
		employee.setEmail("a@gmail.com");
		employee.setAddress("USA");
		
		list.add(employee);
		employee = new Employee();
		employee.setName("Praveen");
		employee.setEmail("b@gmail.com");
		employee.setAddress("IND");
		list.add(employee);
		
		employee = new Employee();
		employee.setName("Rakesh");
		employee.setEmail("c@gmail.com");
		employee.setAddress("AUS");
		list.add(employee);
		
		return list;
		
	}
	
	public List<Employee> addIntoEmployeeList(List<Employee> employeeList){
		List<Employee> list = new ArrayList<>();
		Employee employee = new Employee();
		employee.setName("Arvind");
		employee.setEmail("a@gmail.com");
		employee.setAddress("USA");
		
		list.add(employee);
		employee = new Employee();
		employee.setName("Praveen");
		employee.setEmail("b@gmail.com");
		employee.setAddress("IND");
		list.add(employee);
		
		employee = new Employee();
		employee.setName("Rakesh");
		employee.setEmail("c@gmail.com");
		employee.setAddress("AUS");
		list.add(employee);
		list.addAll(employeeList);
		
		return list;
		
	}
	
}
