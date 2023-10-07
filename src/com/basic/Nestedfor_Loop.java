package com.basic;

public class Nestedfor_Loop {
	public static void main(String[] args) {
		
		   // STEP 1: i=1, 1<=3 (true), j loop will start running (3 times), i = 2
		   // STEP 2: i=2, 2<=3 (true), j loop will start running (3 times), i = 3
		   // STEP 3: i=3, 3<=3 (true), j loop will start running (3 times), i = 4
		   // STEP 4: i=4, 4<=3 (false), i loop will stop 

		for(int i= 1; i<=3; i++) { // outer loop
			for(int j = 1; j<=3; j++) { //inner loop
				
				// STEPs: j=1, 1<=3 (true), Hello will be printed, j = 2
			   // STEPs: j=2, 2<=3 (true), Hello will be printed, j = 3
			   // STEPs: j=3, 3<=3 (true), Hello will be printed, j = 4
			   // STEPs: j=4, 4<=3 (false), j loop will stop 

				System.out.println("Hello"); // so 9 time's hello will print bcoz inner loop will run multiple of 
				                            //outer loop 3*3 =9
			}
			
		}
	}

}
