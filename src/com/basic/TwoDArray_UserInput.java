package com.basic;
import java.util.*;

public class TwoDArray_UserInput {
public static void main(String args[]) {
	Scanner sc  = new Scanner(System.in);
	System.out.print("Enter Number of rows: ");
	int a = sc.nextInt();
	System.out.print("Enter Number of Column: ");
	int b = sc.nextInt();
	
	int arr[][] = new int[a][b];
	for(int i =0; i<=a-1; i++) {
		for(int j =0; j<=b-1; j++) {
			System.out.println("Enter element at row [" + i + "] and at column [" + j + "] : ");
			arr[i][j] = sc.nextInt();
					
		}
		}
	// print the 2D array
	System.out.println("The 2D array content are:");
	for(int i=0; i<=a-1; i++) {
	for(int j=0; j<=b-1; j++) {
		System.out.print(arr[i][j] +" ");
	}
	System.out.println();
	}
	sc.close();
	
}

}
