package com.basic;

// print all element of array

public class ArrayExample {
public static void main(String[] args) {
	int arr[] = new int[5];
	
	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
	arr[3] = 40;
	arr[4] = 50;
//	arr[6] = 60; //error show: java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
	 // print all elements of array using loops
    // index is going from 0 to size-1
	
	for(int i= 0; i<=4; i++) {
		System.out.print(arr[i] +" ") ;
	}

}
}
