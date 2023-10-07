package com.basic;

public class SwitchExample {
	public static void main(String args[]) {
		int day = 6;
		String dayString = " ";// Initialize with a default value
	 // String dayString; Variable declared but not initialized
		
		/*
		 * In this code, the variable dayString is declared but not explicitly 
		 * initialized with a value before the switch statement. While you have 
		 * cases within the switch that assign values to dayString, the compiler 
		 * is not smart enough to determine if any of those cases will definitely be executed. 
		 * If none of the cases are executed (for example, if day is not between 1 and 8), 
		 * then the variable dayString would remain uninitialized when you try to print it,
		 * causing a compilation error.
		 */
		switch(day) {
		case 1:
			dayString = "January";
			break;
		case 2:
			dayString = "Februry";
			break;
		case 3: 
			dayString= "March";
			break;
		case 4:
			dayString = "April";
			break;
		case 5:
			dayString = "May";
			break;
		case 6:
			dayString = "June";
			break;
		case 7:
			dayString= "July";
			break;
		case 8:
			dayString = "August";
			break;
			default:
			System.out.println( "Invalid Month");
		}
		System.out.println(dayString);// No error, dayString is initialized
	//	System.out.println(dayString); Error: dayString might not have been initialized 
    }
	}


