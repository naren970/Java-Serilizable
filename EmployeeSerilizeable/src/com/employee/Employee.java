package com.employee;

import java.io.Serializable;

public class Employee implements Serializable{

	private String employeeName;
	private String employeeId;
	private String employeeDept;
	private String employeeDesgination;
	
	/**
	 * @return the employeeDesgination
	 */
	public String getEmployeeDesgination() {
		return employeeDesgination;
	}
	/**
	 * @param employeeDesgination the employeeDesgination to set
	 */
	public void setEmployeeDesgination(String employeeDesgination) {
		this.employeeDesgination = employeeDesgination;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeDept
	 */
	public String getEmployeeDept() {
		return employeeDept;
	}
	/**
	 * @param employeeDept the employeeDept to set
	 */
	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}
	
	
}
