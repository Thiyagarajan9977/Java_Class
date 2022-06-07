package org.array;

public class TwoDimensionalArray {
			
	public static void main(String[] args) {
		
	String x[][] = new String[3][4];	
		
	x[0][0] = "(0,0)";
	x[0][1] = "(0,1)";
	x[0][2] = "(0,2)";
	x[0][3] = "(0,3)";
	
	
	x[1][0] = "(1,0)";
	x[1][1] = "(1,1)";
	x[1][2] = "(1,2)";
	x[1][3] = "(1,3)";
	
	
	x[2][0] = "(2,0)";
	x[2][1] = "(2,1)";
	x[2][2] = "(2,2)";
	x[2][3] = "(2,3)";
	

		
	
	
	for (int i = 0; i < x.length; i++) {
		
		for (int j = 0; j <= x.length; j++) {
			
			System.out.println(x[i][j]);
			                                                                                
		}		
	}
}
}
