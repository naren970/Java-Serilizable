package com.employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserilizeMain implements Serializable{

	public static void main(String[] args) {
		Employee emp = null;
		try {
			FileInputStream fInput = new FileInputStream("employee.ser");
			ObjectInputStream oInput = new ObjectInputStream(fInput);
			emp = (Employee) oInput.readObject();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found Exception");
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception :");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Emp Id"+ emp.getEmployeeId());
		System.out.println("Emp Name"+ emp.getEmployeeName());
		System.out.println("Emp Desgination"+ emp.getEmployeeDesgination());
		System.out.println("Emp Department"+ emp.getEmployeeDept());
	}
}
