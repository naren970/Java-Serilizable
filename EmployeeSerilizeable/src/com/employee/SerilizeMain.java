package com.employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizeMain {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Creating employee object
		Employee emp = new Employee();
		emp.setEmployeeId("120232");
		emp.setEmployeeName("Narendra");
		emp.setEmployeeDept("CSE");
		emp.setEmployeeDesgination("Assistant Profissor");
		
		
		FileOutputStream fout;
		try {
			
			//Serilizing the Employee object
			fout = new FileOutputStream("employee.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fout);
			objectOut.writeObject(fout);
			objectOut.close();
			fout.close();

		} catch (IOException e) {
			System.out.println("Exception :" + e.toString());
		}
		System.out.println("Serilize done");
		System.out.println("Employee  Id :"+ emp.getEmployeeId());
		System.out.println("Employee  Name :"+ emp.getEmployeeName());
		System.out.println("Employee  Designation :"+ emp.getEmployeeDesgination());
		System.out.println("Employee  Department :"+ emp.getEmployeeDept());

	}
}
