package com.basic;

public class AsciiVlaueExample {
	public static void main(String[] args) {
		// ASCII VALUES - 
	    // 'A' - 'Z' --> 65 - 90
	    // 'a' - 'z' --> 97 - 122 
		
		char a  = 'z';
		int b = a;
		System.out.println(b); // 122 bcoz small z is at 122 & Implicit Type casting is carried
		                         // char is smaller data type as comapre to int data type so  
		                         // Implicit(Automatic) Type casting is possible
		
		int c = 65;
	//  char d = b;
		char d = (char)c;
		System.out.println(d);// error Type mismatch: cannot convert from int to char so we 
		                      // Do Explicit(Manually) type casting
		
		
	}

}
