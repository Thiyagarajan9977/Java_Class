package org.inheritance;

public class Fib {
	
	public static void main(String[] args) {
		
		int A = 0, B = 1, Result; 
		
		for (int i = 0; i < 10; i++) {
			
			Result = A+B;
			A=B;
			B=Result;			
			
			System.out.println(Result);			
			
		}
		
	}

}
