package com.basic;

public class StrinBufferExample {
	public static void main(String args[]) {
		//append() Method
		
		StringBuffer sb  = new StringBuffer("java ");
		sb.append("mega");
		System.out.println(sb);
		
		// insert() method
		
		sb.insert(2, " hello ");
		System.out.println("hello is inserted at position 2 : "+sb);
		
		// reverse() Method
		
		sb.reverse();
		System.out.println(sb);
		
		//replace() Method 
		
	   StringBuffer str = new StringBuffer("world of dragon");
	   str.replace(0, 4, "lambo");
	   System.out.println("replace from index 0 -4: "+str); // world of d remaining bcoz we replace 0-4 index only
	   
	   // delete() Method
	   
	   str.delete(3, 7);
	   System.out.println(str); // lamof dragon bcoz above we replace world with lambo
	   
	   //capacity()  Method
	   
	   StringBuffer str1  = new StringBuffer();
	   	   System.out.println(str1.capacity()); // by default it is 16
	   //ensureCapacity() Method
	   	   
	   	   str1.ensureCapacity(30);// greater than the existing capacity
	   	   System.out.println(str1.capacity()); //output: 34 (by following the rule - (oldcapacity*2) + 2.) 
	   	                                        // i.e (16*2)+2 = 34.
	}
}