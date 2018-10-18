/**
 * 
 */
package com.developers.choice.jpa;

import org.springframework.data.repository.CrudRepository;

import com.developers.choice.model.Employee;

/**
 * @author Scorpio
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee,Long>{

}
