package com.developers.choice.dto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.developers.choice.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
