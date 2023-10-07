package com.basic;

public class OperatorPrecedenceExample {
	
	public static void main(String args[]) {
		
		int a = 2, b = 4, c = 6;
		
		System.out.println (a - ++c - ++b);// -10 bcoz  prefix ++ is higher than that of - subtraction operator.
		
	}

}
