package com.custom.wih;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private String empId;
	private String empName;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
