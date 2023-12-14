package com.imaginnovate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.imaginnovate.dto.UserResponse;
import com.imaginnovate.model.Employee;
import com.imaginnovate.service.EmployeeService;

@Controller
public class ImagInnController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<UserResponse> saveEmployee(@ModelAttribute("employee") Employee employee){
		UserResponse status =employeeService.saveEmployee(employee);
		return new ResponseEntity<UserResponse>(status,HttpStatus.OK);
	}
}
