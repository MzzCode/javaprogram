package com.basic;

public class TypeCastingExample {
public static void main(String args[]) {
	// int to double data type
	// implicit type casting
	
	//e.g= 1
	/*
	int a=10;
	double b = a;
	System.out.println(a);
	System.out.println(b);
	*/
	//E.g: 2
	/*
	int x = 8;
	
	long y = x;
	
	float z = y;
	
	
	
	System.out.println("Before Conversion int value: " +x);
	System.out.println("After conversion long value: " +y);
	System.out.println("After Conversion float value: " +z);
	*/
	
	// Explicit Type casting
	//long to int but here loss of data
	//e.g : 1
	/*
	long c = 984454532334l;
	//int d =c; // impossible to type-cast show error 
	int d = (int)c; //for type cast must be write data type again after assignment operator but here also a loss of data.
	System.out.println(c);
	System.out.println(d);
	*/
	
	//E.g 2
	/*
	double x = 166.5;
	
	//converting double data type into long data type  

	long y = (long)x; //fractional part lost  
	
	//converting long data type into int data type  
	
	int z = (int)y; //fractional part lost  
	
	System.out.println("Before conversion 'double value': " +x);
	System.out.println("After conversion 'Long value': " +y);
	System.out.println("After conversion 'int value': " +z);
	
	*/
}
}
