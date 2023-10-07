package com.basic;
import java.util.*;
public class IfconditionExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int a = sc.nextInt();
		
		 if(a%2 ==0) {
			 System.out.println("number is even: "+a);
		 }else {
			 System.out.println("number is odd: "+a);
			 
			 }
		 int b = -3;
		 if (b<0) {
			 System.out.println(b+" is a negative number");
		 }
		 
	}

}
