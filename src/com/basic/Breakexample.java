package com.basic;

public class Breakexample {
	public static void main(String args[]) {
		/*
		int expression  = 2;
		switch(expression) {
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2"); // only case 2 execute
			break;
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 4");
			break;
			// also there is no default which is also optional
		*/
			//example 2 without break statement
		
			int expression  = 2;
			switch(expression) {
			case 1:
				System.out.println("case 1");
			
				//condition matching execution till default bcoz of no break
			case 2:
				System.out.println("case 2"); 
				
			case 3:
				System.out.println("case 3");
				
			case 4:
				System.out.println("case 4");
				
				default:
					System.out.println("Default case");
					
		}
	}

}
