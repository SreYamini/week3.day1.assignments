package week3.day1.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		
		String test = "changeme";
		
		char[] odd = test.toCharArray();
		
		for (int i = 0; i < odd.length; i++) {
			
			if(i%2!=0) {
				
				System.out.println(Character.toUpperCase(odd[i]));
				
			}
			else {
				System.out.println(odd[i]);
			}
		}

	}

}
