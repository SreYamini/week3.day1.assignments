package week3.day1.assignments;



public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		

		
		String[] removedup = text.split(" ");
		
		for (int i = 0; i < removedup.length; i++) {
			
			for (int j = i+1; j < removedup.length; j++) {
				
				if(removedup[i].equals(removedup[j])) {
					
					removedup[j]="";
					
				}
				
				
			}
			
				System.out.println(removedup[i]+ "");
			
			
		}
		
		
		/*
		 	
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */

	}

}
