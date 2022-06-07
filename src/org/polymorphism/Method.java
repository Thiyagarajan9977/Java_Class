package org.polymorphism;

public class Method {
	
	// Same Class
	// Same Method Name
	// Different Argument Passing
	
	
	// DataType Count
	
	private void student(String name) {
		System.out.println("Test 1 :" +name);

	}
	
	private void student(int no) {
		System.out.println("Test 2" +no);

	}
	
	private void student(long salary) {
		System.out.println("Test 3" + salary);

	}
	
	private void student(float cash) {
		System.out.println("Test 4" + cash);

	}
	
	// DataType Order
	
	private void student(String value, long phoneno) {
		System.out.println("Test 5" +value +phoneno);

	}
	
	private void student(boolean status) {
		System.out.println("Test 6 : " +status);

	}
	
	public static void main(String[] args) {
		
		// ClassName objName = new ClassName();
		
		Method emp = new Method();
		emp.student("Thiagu");
		emp.student(true);
		emp.student(21541);
		emp.student(123456);
		emp.student(74444);		
		emp.student("5415", 9876543210l);				
	}
}
