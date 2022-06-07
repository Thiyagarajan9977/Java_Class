package org.arrayquestions;

public class ArrayQ1 {
	
	public static void main(String[] args) {
		
		//Datatype variable[] = {"Values "}; 
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for (int i = 1; i <= a.length; i++) {
			
			sum=(sum+i);
		}	
		
		System.out.println("The sum of the value is " +sum);
		
		
		Object ob [][] = new Object [3][3];
		
		ob[0][0] = "one";
		ob[0][1] = "Two";
		ob[0][2] = "Three";
		
		ob[1][0] = "Four";
		ob[1][1] = "Five";
		ob[1][2] = "Six";
		
		ob[2][0] = "7/7";
		ob[2][1] = "0.8888";
		ob[2][2] = "9";
		
		System.out.println(ob.length);
		
		for (int i = 0; i < ob.length; i++) {
			
			for (int j = 0; j < ob.length; j++) {
				
				System.out.println(ob[i][j]);
				
				
			}
			
		}
		
		
	}
}
