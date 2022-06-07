package org.polymorphism;

public class Method_Overiding2 extends Method_Overiding {
	
	
	// A Same method having same argument in different class name called Methods Overriding
	
	//A Parent class method business logic is overridden by child class method
	// Must Using the extend keyword
	// Same Method Name
	
	@Override
	public void savings(int value) {
		System.out.println("Test B Savings " +value);
	}
	
	@Override
	public void current() {
		System.out.println("Test B Current ");
	}
	
	@Override
	public void rbibank(String bank) {
		System.out.println("Test B rbibank " + bank);
	}
	
	public static void main(String[] args) {
		
		
		// ClassName obj = new ClassName();
		
		Method_Overiding2 over = new Method_Overiding2();
		over.rbibank("My Own Bank");
		over.savings(1000);
		over.current();		
	}
}
