package com.Employees.Models;

import java.util.Date;

public class TitlesDao {
	private EmployeesDao employees;
	public void setEmployees(EmployeesDao employees) {
		this.employees = employees;
	}
	private String  title;
	private  Date from_date;
	private  Date to_date;
	public TitlesDao() {
	
	}
	public EmployeesDao getEmployees() {
		return employees;
	}
	public void setEmployess(EmployeesDao employess) {
		this.employees = employess;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	public TitlesDao(EmployeesDao employees, String title, Date from_date, Date to_date) {
		super();
		this.employees = employees;
		this.title = title;
		this.from_date = from_date;
		this.to_date = to_date;
	}
	
	

}
