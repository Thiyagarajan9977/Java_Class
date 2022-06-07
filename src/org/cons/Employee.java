package org.cons;

public class Employee {

	public Employee() {
		
		this(1532);
		System.out.println("default constructor");
		System.out.println("i am the first");
	}

	public Employee(int a) {
		System.out.println("Int Parameterized Constructor");
		System.out.println("next to para");
	}

	public static void main(String[] args) {

		Employee c = new Employee();
		
		

	}

}
