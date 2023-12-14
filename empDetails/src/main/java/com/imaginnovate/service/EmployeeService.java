package com.imaginnovate.service;

import java.util.List;

import com.imaginnovate.dto.UserResponse;
import com.imaginnovate.model.Employee;

public interface EmployeeService {
	List<Employee> getEmpCurrFinYrTaxDeductionDetails();
	UserResponse saveEmployee(Employee employee);
}
