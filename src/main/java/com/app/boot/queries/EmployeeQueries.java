package com.app.boot.queries;

public class EmployeeQueries {

	public static String getQuery() {
		StringBuilder sb=new StringBuilder();
		sb.append("select * from employee where eid=:eid");
		return sb.toString();
	}

	public static String getAllEmployees() {
		StringBuilder sb=new StringBuilder();
		sb.append("select * from employee");
		return sb.toString();
	}

	public static String createEmployee() {
		StringBuilder sb=new StringBuilder();
		sb.append("insert into employee(eid,ename,jobtitle,erole) values(?,?,?,?)");
		return sb.toString();
	}

	public static String createUser() {
		StringBuilder sb=new StringBuilder();
		sb.append("insert into users(username,url) values(?,?)");
		return sb.toString();
	}
	
}
