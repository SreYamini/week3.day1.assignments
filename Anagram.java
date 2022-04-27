package week3.day1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		
		int length1 = text1.length();
		int length2 = text2.length();
		
		if(length1==length2) {
			
			System.out.println("The length is same");
		}
		
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("it is a anagram");
			}
			else {
				System.out.println("it is not a anagram");
			}
	

	}

}
