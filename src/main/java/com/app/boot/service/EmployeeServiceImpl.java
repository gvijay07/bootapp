package com.app.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.boot.employee.Employee;
import com.app.boot.employee.User;
import com.app.boot.repository.EmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeServiceImpl {

	@Autowired
	EmployeeRepositoryImpl employeeRepositoryImpl;
	public List<Employee> getEmployees(int id) {
		return employeeRepositoryImpl.getEmployees(id);
	}
	public List<Employee> getEmployees() {
		
		return employeeRepositoryImpl.getEmployees();
	}
	public int createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepositoryImpl.createEmployee(employee);
	}
	public int createUser(User user) {
		
		return employeeRepositoryImpl.createUser(user);
	}

}
