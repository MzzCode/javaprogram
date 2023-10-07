package com.basic;

public class TwoDArray {
	public static void main (String args[]) {
		int arr[][] = new int[2][3];
		 arr[0][0] = 5;
		 arr[0][1] = 10;
		 arr[0][2] = 11;
		
		 arr[1][0] = 15;
		 arr[1][1] = 19;
		 arr[1][2] = 4;
		 System.out.println("The 2D array content are:"); // outside loop bcoz  avoid repeating again and again this line. 
		for(int i=0; i<2;i++) { // row
			for (int j=0; j<3; j++) { // columns
				System.out.print(arr[i][j] +" "); 
			}
			System.out.println(); // changing the row
		}
	}

}
