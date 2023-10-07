package com.basic;

public class NestedIfexample {
	public static void main(String args[]) {
		 int i = 10;
		    if (i == 10) {
		      // First if statement
		      if (i < 20)
		        System.out.println("i is smaller than 20");
		      // Nested - if statement
		      if (i < 15)
		        System.out.println("i is smaller than 15 too");
		      else
		        System.out.println("i is greater than 20");
		    }
		    //2nd example
		    int age=20;  
		    int weight=80;    
		    //applying condition on age and weight  
		    if(age>=18){    
		        if(weight>50){  
		            System.out.println("You are eligible to donate blood");  
		        }    
		    } 
		    // 3rd example
		    
		    int age1=25;    
		    int weight1=48;      
		    //applying condition on age and weight    
		    if(age1>=18){      
		        if(weight1>50){    
		            System.out.println("You are eligible to donate blood");    
		        } else{  
		            System.out.println("You are not eligible to donate blood");    
		        }  
		    } else{  
		      System.out.println("Age must be greater than 18");  
		    }  
	}

}
