package org.abstraction;

public class GreensBank extends RBIbank {

	@Override
	public void savings() {
		System.out.println("Savings % is 6");
	}

	@Override
	public void current() {
		System.out.println("Currnt % is 6"); 
		
	}	
	
	private void deposit() {
		System.out.println("Deposit % is 6");
	}
	
	public static void main(String[] args) {
		GreensBank gr = new GreensBank();
		fixed();
		gr.deposit();
		gr.current();
		gr.savings();
		

	}


}
