package week3.day1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		String test = "I am a software tester";
		
		String[] split = test.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			if(i%2!=0) {
				
				char[] odd = split[i].toCharArray();
				
				for (int j = odd.length-1; j >= 0; j--) {
					
					System.out.println(odd[j]);
				}
				System.out.println(" ");
			}
			
			else {
				System.out.println(split[i] + " ");
			}
		}
		

	}

}
