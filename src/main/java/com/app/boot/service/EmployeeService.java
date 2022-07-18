package com.app.boot.service;

import java.util.List;

import com.app.boot.employee.Employee;
import com.app.boot.employee.User;


public interface EmployeeService {
	public List<Employee> getEmployees(int id);
	public List<Employee> getEmployees();
	public int createEmployee(Employee employee);
	public int createUser(User user);
}
