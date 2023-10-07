package com.basic;
public class StringMethod {
	
	public static void main(String args[]) {
		// .length() Method
		String str1 = ("java is awesome programming language");// spaces also count
		System.out.println("Length of string is: " + str1.length());
		
		//charAt(index i) Method
		
		String str2  = "java is fun";
		System.out.println(str2.charAt(4)+ ",");// Space is also count at 4 there is no character but have space
		                                         //for showing space we just add a comma(,) at console.
		
		System.out.println("character at zero index: "+str2.charAt(0)); // j
		System.out.println("character at 5th index: "+str2.charAt(5)); // i 
		
		//concat() Method
		String str3 = "Hello java";
		String str4 = "Hello user";
		
		System.out.println(str3.concat(" "+str4)); // for space b/w two string we can use double quotes. 
		System.out.println(str3+ " " +str4); // we can also concatenate two string with the help of + operator
		 
		//equal() Method
		
		String str5 = "India";
		String str6 = "india";
		System.out.println(str5.equals(str6)); //false bcoz (I) have two different case lower and uppercase
		                                       // java don't tolerate this due to case sensitive property
		
		String str7 = "Jhon";
		String str8 = "Jhon";
		boolean result = str7.equals(str8);
		System.out.println(result);// true
		
		//compareTo() Method
		
		String  str9 = "Learn Java";
		String str10 = "Learn JavaScript";
		String str11 = "Learn C++";
		String str12 = "Learn Python";
		System.out.println(str9.compareTo(str10)); 
		System.out.println(str11.compareTo(str12));
		System.out.println(str11.compareTo(str9));
		
		//toLowerCase() Method
		String str13 = "JAVA PROGRAMING";
		System.out.println(str13.toLowerCase());
		
		//toUpperCase() Method
		
		String str14  = "java Programing";
		System.out.println(str14.toUpperCase());
		
		//substring (int i, int j) Method
		
		String str15 = "Cool java";
		System.out.println(str15.substring(0, 6));
		
		//indexOf() Method
		
		String str16  = "Hows your day is going";
		System.out.println("The word 'is' starts at position: " +str16.indexOf("is"));
		
		//replace() Method
		String str17 = "i love java programming";
		System.out.println(str17.replace("java", "DSA"));
		
	}

}
