package com.basic;

public class LeftAndRight_Diagonal_2D_Array {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		// size of array find
		int rows = arr.length;
		int cols = arr[0].length;
		System.out.println("Size of the 2D Array: " + rows + " rows x " + cols + " columns");
// for left Diagonal Element
		System.out.println("Left Diagonal Element");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==j) { // for left diagonal element
					System.out.print(arr[i][j] +" ");
				}
				
				}
			}
		// for right Diagonal Element
		
		System.out.println("\nRight Diagonal Element");
		for(int i = 0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if (i+j ==3-1) { // for right diagonal
					System.out.print(arr[i][j] +" ");
			}
		}
		
		}
		
	}

}

