package org.inheritance;

public class Staff extends ClassA_Inherit{

	// Control + Spacebar

	public void staffId() {
		System.out.println("My staff ID is : 12345 ");
	}

	public void staffName() {
		System.out.println("staff Name is : Thiyagu");
	}

	public void staffDob() {
		System.out.println("staff DOB is : 1999");

	}

	public void staffPhone() {
		System.out.println("staff phone is : 99876543210 ");

	}

	public void staffEmail() {
		System.out.println("staff Name is : Thiyagu@gmail.com");

	}

	public void staffAddress() {
		System.out.println("staff address is : Tambaram");
	}
	
	public static void main(String[] args) {
		
		// ClassName objName = new ClassName();
		
		Staff staff = new Staff();		
			
		staff.staffName();
		staff.staffId();
		staff.staffAddress();
		staff.staffPhone();
		staff.staffDob();
		
		
	}

}
