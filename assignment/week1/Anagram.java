package assignment.week1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "stops";
		String str2 = "potss";
		
		if(str1.length() == str2.length()) {
			 char[] ch1 = str1.toCharArray();
			 char[] ch2 = str2.toCharArray();
			 
			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			 
			 if(Arrays.equals(ch1, ch2)) {
				 
				 System.out.println("Given Strings are Anagram");
			 }
			 
			 else {
				 System.out.println("Not a Anagram Strings");
			 }
		}
		
		else {
			System.out.println("Not a valid String");
		}

	}

}
