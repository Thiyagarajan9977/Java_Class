package org.inheritance;

public class Multiple_Inheritance implements ClassA, ClassB  {
	
	public void employee() {

		System.out.println("employee");

	}
	
	public void student() {
		System.out.println("student");

	}
	
	public void staff() {
		System.out.println("staff");

	}
	

	public static void main(String[] args) {
		
		Multiple_Inheritance mi = new Multiple_Inheritance();
		mi.employee();
		mi.student();
		mi.staff();
		
	}
	
	@Override
	public void savings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void current() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void marks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bank() {
		// TODO Auto-generated method stub
		
		
		
		
	}
}
