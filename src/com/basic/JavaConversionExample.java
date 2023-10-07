package com.basic;

public class JavaConversionExample {
	public static void main(String args[]) {
		// Both are inbuilt function
        // toString - It will take a integer and convert into string 
        // parseInt - It will take a string and convert it into integer 

		// Integer to string 
        int a = 10000; 
        String s = Integer.toString(a); 
        System.out.println(s);

     // String to Integer 
        String b = "1235";
        int d = Integer.parseInt(b);
        System.out.println(d);
        
     // Double to string 
        double g = 10000.445; 
        String h = Double.toString(g); 
        System.out.println(h);
        
        // String to Double
        String c = "1235.56";
        double f = Double.parseDouble(c);
        System.out.println(f);


	}

}
