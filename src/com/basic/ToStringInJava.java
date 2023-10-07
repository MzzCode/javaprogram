package com.basic;

public class ToStringInJava {
			//Understanding problem without ToString Method
		String name;
		int age;
		String collage;
		String course;
		String Address;
		// Constructor of this class
		
		ToStringInJava(String name, int age, String collage, String course, String Address)
		{
					// This variable refers to current instance itself
			this.name =name;
			this.age = age;
			this.collage  =collage;
			this.course = course;
			this.Address  =Address;
		} // Method 
//		public static void main(String args[]) {
//			// Creating an object of this class
//			// Custom attributes been passed as in arguments
//			
//			ToStringInJava t = new ToStringInJava("Mega ", 32, " HMR" ," IT", " Mangolia" );
//			System.out.println(t);
//			System.out.println(t.toString());
			
			/*Output explanation: 
			  In the above program, we create an Object of ToStringInJava class 
			  and provide all the information.But when we try to print the Object, 
			  then we are getting some output which is in the form of 
			  classname@HashCode_in_Hexadeciaml_form.If we want the proper information 
			  about the ToStringInJava object, then we have to override the toString() 
			  method of the Object class in our ToStringInJava class.
			 */
			
			//Example of Java toString() method
			
		    
		    // Creating our own toString() method
			
			public String toString() 
			{
				return "name: "+ name + " age: " + age + " collage: " + collage + " course: " + course + " Address: " + Address ;
			}
			
			//main Method
			public static void main(String args[]) {
				// Creating an object of this class
				// Custom attributes been passed as in arguments
				
				ToStringInJava t = new ToStringInJava("Mega,", 32, "HMR," ,"IT,", "Mangolia" );
				// Print the object.
				System.out.println(t);
				// Printing object but using toString() method.
				System.out.println(t.toString());
				// both will print the same.
	}

}
