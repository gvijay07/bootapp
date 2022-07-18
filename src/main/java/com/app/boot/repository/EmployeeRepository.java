package com.app.boot.repository;

import java.util.List;

import com.app.boot.employee.Employee;
import com.app.boot.employee.User;


public interface EmployeeRepository {
	public List<Employee> getEmployees(int id);
	public List<Employee> getEmployees();
	public int createEmployee(Employee employee);
	public int createUser(User user);
}
