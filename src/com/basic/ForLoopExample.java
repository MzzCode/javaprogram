package com.basic;

public class ForLoopExample {
public static void main(String args[]) {
	// print hello 5 times 
	
	// Working 
	// STEP 1 - i=1, 1<=5 (true), Hello is printed, i will be updated to 2
	// STEP 2 - i=2, 1<=5 (true), Hello is printed, i will be updated to 3 
	// STEP 3 - i=3, 1<=5 (true), Hello is printed, i will be updated to 4 
	// STEP 4 - i=4, 1<=5 (true), Hello is printed, i will be updated to 5
	// STEP 5 - i=5, 1<=5 (true), Hello is printed, i will be updated to 5
	// STEP 6 - i=6, 1<=5 (false), loop will stop  
	
	for(int i=1; i<=5 ; i++ ) {
		System.out.println("hello");
	}
	// example 2
	for (int i=1; i<=10; i=i*2) {
		System.out.println(i);// 1 2 4 8
	}
	
	// Example 3
	for (int i=5; i>=1; --i) {
		System.out.println(i); // 5 4 3 2 1
	}
	
	// Example 4 infinite loop -it will never Stop
	// so avoid it
//	for(int i =2; i>=1; i++) {
//		System.out.println(i);
//	}
	
	// Example 4
	
	for (char i = 'A'; i<= 'Z'; i++) {
		System.out.print(i+" ");
	}
}
}
