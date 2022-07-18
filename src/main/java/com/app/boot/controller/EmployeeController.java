package com.app.boot.controller;

import java.rmi.ServerException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.boot.constants.EmployeeConstants;
import com.app.boot.employee.Employee;
import com.app.boot.employee.User;
import com.app.boot.exception.EmployeeException;
import com.app.boot.service.EmployeeServiceImpl;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	@GetMapping(path="/getDetails",produces = "application/json")
	public List<Employee> getEmployeeDetails(@RequestParam (value = "id",required = true)int id) throws EmployeeException{
		try {
		return employeeServiceImpl.getEmployees(id);
		}
		catch (Exception e) {
			throw new EmployeeException(2000,e,EmployeeConstants.ERR_DESC,null);
		}
	}
	
	@GetMapping(path="/getAllDetails",produces = "application/json")
	public List<Employee> getEmployeeDetails(){
		return employeeServiceImpl.getEmployees();
	}
	
	@PostMapping(path = "/createEmployee", consumes = "application/json")
	public int createEmployee(@RequestBody Employee employee) throws EmployeeException{
		int empCount;
		try {
			empCount = employeeServiceImpl.createEmployee(employee);
		
		if(empCount==0)
			throw new ServerException("request body is empty");
		}
		
		catch (Exception e) {
			throw new EmployeeException(2000,e,EmployeeConstants.ERR_DESC,null);
		}
		return empCount;
	}
	
	@PostMapping(path = "/createUser", consumes = "application/json")
	public int createEmployee(@RequestBody User user) throws EmployeeException{
		int empCount;
		try {
			empCount = employeeServiceImpl.createUser(user);
		
		if(empCount==0)
			throw new ServerException("request body is empty");
		}
		
		catch (Exception e) {
			throw new EmployeeException(2000,e,EmployeeConstants.ERR_DESC,null);
		}
		return empCount;
	}
}
