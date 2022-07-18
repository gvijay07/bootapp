package com.app.boot.employee;

public class Employee {
	private int eid;
	private String ename;
	private String jobtitle;
	private String erole;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, String jobtitle, String erole) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.jobtitle = jobtitle;
		this.erole = erole;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getErole() {
		return erole;
	}
	public void setErole(String erole) {
		this.erole = erole;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", jobtitle=" + jobtitle + ", erole=" + erole + "]";
	}
	
}
