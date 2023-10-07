package com.basic;

public class logicalOperatorExample {
	public static void main(String args[]) {
		
		boolean a = false;
		boolean b = 5 == 5;
		boolean c = 5>7;
		
		System.out.println(a && b && c); // false 
		System.out.println(a || b || c); // true bcoz one condition is true
		System.out.println(!a); //true
		System.out.println(c); // false
			
		
	}

}
