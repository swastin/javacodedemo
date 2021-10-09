package com.Employees.Models;

import java.util.Date;

public class SalariesDao {
private EmployeesDao employess;
private int salary;
private  Date from_date;
private  Date to_date;
	public SalariesDao() {
		
	}
	
	
	public SalariesDao(EmployeesDao employess, int salary, Date from_date, Date to_date) {
		super();
		this.employess = employess;
		this.salary = salary;
		this.from_date = from_date;
		this.to_date = to_date;
	}


	public EmployeesDao getEmployess() {
		return employess;
	}
	public void setEmployess(EmployeesDao employess) {
		this.employess = employess;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
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

}
