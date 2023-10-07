package com.basic;
import java.util.*;


public class ScannerExample {
	public static void main (String args[]) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
        System.out.println("Name: " +name);
*/
		/*
		
		String s = "this is scanner class";
		Scanner sc = new Scanner(s);
		System.out.println("Boolean: " + sc.hasNext());//It returns true if this scanner has another token in its input.
		System.out.println("String: " + sc.nextLine());
		
		*/
		
		
		System.out.println("<--------- Enter Your Detail --------->");
		
		Scanner sc = new Scanner(System.in);
		//name
		System.out.println("Enter Your Name:");
		String name = sc.nextLine();
		System.out.println("Name " +name);
		
		//Age
		
		System.out.println("Enter your Age:");
		int a = sc.nextInt();
		System.out.println("Age: " +a);
		
		//salary
		
		System.out.println("Enter your salary:");
		long b = sc.nextLong();
		System.out.println("Your Salary : " +b);
			
}
}