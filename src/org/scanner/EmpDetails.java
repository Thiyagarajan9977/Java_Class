package org.scanner;

import java.util.Scanner;

public class EmpDetails {

		
	
	
	public static void main(String[] args) {

		// Scanner is a predefined class
		
		// Syntax
		
		// ClassName objectName = new ClassName(System.in);
		 
		
		
		
		//(System.in) [System is a predefined Class its avail in Java.lang] means in run time the user should give the input 
		//that time console accept the input logic are written in system.in then only we are using 
		//System.in parameter
		
		//System.out.println means to print the output
			
		
	
		
		Scanner emp = new Scanner(System.in);
		
		System.out.println("Enter the emp ID");
		
		
		
		int empid = emp.nextInt();
		System.out.println("My Emp ID is " + empid);

		System.out.println("Enter the emp Name");
		
		
		// CTRL + 2 + L
		
		
		String jack = emp.next();
		
		System.out.println("My Emp Name is : " +jack);
		
		
		String empName = emp.next();
		System.out.println("Enter the emp name" + empName);

		System.out.println("Enter the email");
		String email = emp.next();
		System.out.println("Enter the email" + email);

		System.out.println("Enter the phone");
		long phone = emp.nextLong();
		System.out.println("Enter the phone" + phone);

		System.out.println("Enter the emp Salary");
		float Salary = emp.nextFloat();
		System.out.println("Enter the emp Salary" + Salary);

		System.out.println("Enter the emp Gender");
		char Gender = emp.next().charAt(0);
		System.out.println("Enter the emp Gender : " + Gender);

		System.out.println("Enter the emp empcity");
		String empcity = emp.next();
		System.out.println("Enter the empcity" + empcity);		
	}
}
