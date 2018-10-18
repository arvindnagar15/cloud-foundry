/**
 * 
 */
package com.developers.choice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developers.choice.dto.EmployeeRepository;
import com.developers.choice.model.Employee;

/**
 * @author Scorpio
 *
 */
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployeeDetails(){
		List<Employee> list = (List<Employee>) employeeRepository.findAll();
		return list;
	}
	public List<Employee> saveEmployee(Employee employee){
		employeeRepository.save(employee);
		List<Employee> list = (List<Employee>) employeeRepository.findAll();
		return list;
	}
}
