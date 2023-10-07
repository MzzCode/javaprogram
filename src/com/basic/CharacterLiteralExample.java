package com.basic;

public class CharacterLiteralExample {
	
	public static void main(String args[]) {
		
		// single character literal- with single quote
		
		char a = 'z';
		
		// integer literal with octal form
		
		//char b = 0568; //The literal 0568 of type int is out of range 
		
		//unicode representaion
		
		char c = '\u0065';
		
		System.out.println("single character literal- with single quote: " +a);
		//System.out.println("integer literal with octal form: " +b); //The literal 0568 of type int is out of range 
		System.out.println("unicode \n repersentation: " +c);
	}

 
}
