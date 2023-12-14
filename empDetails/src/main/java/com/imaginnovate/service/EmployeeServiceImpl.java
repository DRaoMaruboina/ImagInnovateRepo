package com.imaginnovate.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.dao.EmployeeRepository;
import com.imaginnovate.dto.UserResponse;
import com.imaginnovate.exception.EmployeeServiceException;
import com.imaginnovate.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getEmpCurrFinYrTaxDeductionDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserResponse saveEmployee(Employee employee) {
		try {
			UserResponse response = new UserResponse();
		this.employeeRepository.save(employee);
		response.setResponseCode(200);
		response.setResponseMessage("Record saved successfully");
		response.setTimestamp(new Date());
		return response;
		}catch(Exception exc) {
			throw new EmployeeServiceException(exc.getMessage());
		}
	}
	
	

}
