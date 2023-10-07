package com.basic;

public class PatternExample {
	public static void main(String[] args) {
		
		for(int i =1; i<=5; i++) { // inner loop : Number of rows printed ->here 5 rows, i<=5
			for(int j= 1; j<=3; j++) { // outer loop : what printed in that row -> 3 star in each row, j<=3
				System.out.print("*");
			}
			System.out.println(); // changing the row or line
		}
	}

}
