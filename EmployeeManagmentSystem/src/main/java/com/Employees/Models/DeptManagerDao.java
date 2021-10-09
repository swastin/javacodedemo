package com.Employees.Models;

import java.util.Date;

public class DeptManagerDao {
	public DeptManagerDao(EmployeesDao employees, DepartmentsDao dept, Date from_date, Date to_date) {
		super();
		this.employees = employees;
		this.dept = dept;
		this.from_date = from_date;
		this.to_date = to_date;
	}
	private EmployeesDao employees;
	private DepartmentsDao dept;
	private  Date from_date;
	private  Date to_date;
	public DeptManagerDao() {
		// TODO Auto-generated constructor stub
	}
	public EmployeesDao getEmployees() {
		return employees;
	}
	public void setEmployees(EmployeesDao employees) {
		this.employees = employees;
	}
	public DepartmentsDao getDept() {
		return dept;
	}
	public void setDept(DepartmentsDao dept) {
		this.dept = dept;
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
