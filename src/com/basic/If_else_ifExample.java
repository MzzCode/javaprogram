package com.basic;

public class If_else_ifExample {
	public static void main(String args[]) {
		int marks = 65;
		
		if (marks<40){
			System.out.println("result is fail");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("result is D grade");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("result is c grade");// execute
		}
		else if(marks>=70 && marks<80) {
			System.out.println("result is d grade");
		}else if(marks>=80 && marks<90) {
			System.out.println("result is a grade");
		}
		// 2nd example
		
		int num =3;
		if (num == 1 ) {
			System.out.println("monday");
		}else if(num == 2) {
			System.out.println("tuesday");
		}
		else if(num == 3) {
			System.out.println("wednesday");// wednesday
		}else if (num == 4) {
			System.out.println("thursday");
		}
	}

}
