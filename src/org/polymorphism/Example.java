package org.polymorphism;

public class Example {
	
	
	private void addition(String name, int age) {
		System.out.println("test A :" +name  +age);

	}
	
	private void addition(String name,long dob) {
		System.out.println("test b");

	}
	
	private void addition(String name, int age, long dob) {
		System.out.println("test c");

	}
	
	public static void main(String[] args) {
		
		Example sx = new Example();
		sx.addition("Thia", 123);
		sx.addition("manoj", 23154145214l);
		sx.addition("alex", 21, 25);
	}
	

}
