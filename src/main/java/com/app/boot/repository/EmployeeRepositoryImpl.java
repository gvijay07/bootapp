package com.app.boot.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.boot.employee.Employee;
import com.app.boot.employee.User;
import com.app.boot.queries.EmployeeQueries;

@Repository("employeeDao")
public class EmployeeRepositoryImpl {

	@Autowired
	private NamedParameterJdbcTemplate nameJdbcTemplate;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<Employee> getEmployees(int id) {
		Map<String, Object> paramsMap = new HashMap<String, Object>();
		paramsMap.put("eid", id);

		return nameJdbcTemplate.query(EmployeeQueries.getQuery(), paramsMap,
				new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public List<Employee> getEmployees() {

		return nameJdbcTemplate.query(EmployeeQueries.getAllEmployees(),
				new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public int createEmployee(Employee employee) {
		
		return jdbcTemplate.update(EmployeeQueries.createEmployee(), employee.getEid(),employee.getEname(),employee.getJobtitle(),employee.getErole());
	}

	public int createUser(User user) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(EmployeeQueries.createUser(), user.getUsername(),user.getUrl());
	}

}
