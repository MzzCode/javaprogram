package com.basic;
//print number 1 to 5
public class DoWhile_loopExample {
	public static void main(String args[]) {
		int i =1; // initial Statement
		do {
			System.out.println(i); // statement
			i++; // update statement
		}while(i<=5); // test statement if here test condition is false then also
		             // do while loop runs bcoz condition is checked after loop body. 
	}

}
