package com.Employees.Models;

import java.util.Date;

public class EmployeesDao {
	
	
	private  int empno;
	private  Date birth_date;
	private  String first_name;
	private  String last_name;
	private   char gender;
	private  Date hire_date;
	public EmployeesDao(int empno, Date birth_date, String first_name, String last_name, Date hire_date) {
		super();
		this.empno = empno;
		this.birth_date = birth_date;
		this.first_name = first_name;
		this.last_name = last_name;
		this.hire_date = hire_date;
	}
	
	public int getEmpno() {
		return empno;
	}
	
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
