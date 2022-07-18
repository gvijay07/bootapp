package com.app.boot.employee;

public class User {
	private String username;
	private String url;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String url) {
		super();
		this.username = username;
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
