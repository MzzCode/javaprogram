package com.basic;

public class VariableExample {
	//Instance Variable
	/*
		int studentid;
		String name;
		{
			this.studentid = 1;
			this.name = "mega"; 
		}
		*/
	
	//Static Variable
	
	static int a = 10;
	static String name = "mega"; 
	
// main method
public static void main(String args[]) {
	// Local Variable
	
	// eg:1
	//int a= 10;
	//System.out.println("Local Variable: " +a);
	
	// eg:2
	
	/*
	int a =10;
	String name = "mega";
	System.out.println("local varible: " + a);
	System.out.println("local variable String: " + name);
	*/
	
	// object creation for Instance Variable
	/*
	VariableExample s = new VariableExample();
	System.out.println("Studentid is: " +s.studentid);
	System.out.println("Student Name is: " +s.name);
	*/
	
	//static variable call no need to create object
	
	System.out.println("static integer: " +a);
	System.out.println("static String name: " +name);
	
}
}
