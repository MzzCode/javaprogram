package com.basic;

public class UraniryOperatorExample {

	public static void main(String args[]) {
		
		int a = 10; //11
		int b = 5; //4
		
		// increment 
		
		System.out.println("prefix of a: " + (a++)); //10
		System.out.println(a); //11
		System.out.println("Postfix of a: " + (++a)); //12
		System.out.println(a);//12
		
		
		//decrement 
		
		System.out.println("prfix of b: " +(b--));//5
		System.out.println(b);//4
		System.out.println("postfix of b: " +(--b) ); //3
		System.out.println(b);//3
		
		
	}
}
