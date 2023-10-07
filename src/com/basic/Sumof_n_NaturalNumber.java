package com.basic;
public class Sumof_n_NaturalNumber {
	public static void main(String[] args) {
		int sum=0;
		int n =5;
		 for(int i=1; i<=n; i++) {
			 sum = sum+i;
		 }
		 System.out.println("Sum of first N natural numbers: " +sum);
	}
}
