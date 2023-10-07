package com.basic;

public class RelationalOperatorExample {
	public static void main(String args[]) {
		
		int a = 10;
		int b = 3;
		int c = 5;
		
		System.out.println(a == c); //true
		System.out.println(a != b); //true
		System.out.println(c > b); //true
		System.out.println(a > c); //true
		System.out.println(b >= a); //false
		System.out.println(c <= b); // false
	}

}
