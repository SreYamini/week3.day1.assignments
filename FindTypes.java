package week3.day1.assignments;

public class FindTypes {

	public static void main(String[] args) {
		
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;
				
				
				char[] text = test.toCharArray();
				
				for (int i = 0; i < text.length; i++) {
					
					if(Character.isLetter(text[i])) {
						
						letter =letter+1;
					}
					
					else if(Character.isDigit(text[i])){
						
						num = num +1;
					}
					
					else if(Character.isSpaceChar(text[i])){
						
						space = space +1;
					}
					
					else {
						
						specialChar = specialChar+1;
					}
				}
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);
				
}
	
}