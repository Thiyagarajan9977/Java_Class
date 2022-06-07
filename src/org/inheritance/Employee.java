package org.inheritance;

public class Employee {

	// Control + Spacebar

	public static void empId() {
		System.out.println("My Emp ID is : 12345 ");
	}
	
	
	public void empName() {
		System.out.println("Emp Name is : Thiyagu");
	}

	public void empDob() {
		System.out.println("Emp DOB is : 1999");

	}

	public void empPhone() {
		System.out.println("Emp phone is : 99876543210 ");

	}

	public void empEmail() {
		System.out.println("Emp Name is : Thiyagu@gmail.com");

	}

	public void empAddress() {
		System.out.println("Emp address is : Tambaram");
	}
	
	public void emproll() {
		System.out.println("This is new Roll");

	}
	
	public static void main(String[] args) {
		
		// ClassName objName = new ClassName();
		
		Employee emp = new Employee();
		
		
		Student std = new Student();
		std.StudentName();
		std.StudentAddress();
		std.StudentEmail();
		std.StudentPhone();
	
			
		emp.empName();
		emp.empId();
		emp.empAddress();
		emp.empPhone();
		emp.empDob();	
		
	}

}
