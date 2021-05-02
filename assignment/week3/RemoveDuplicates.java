package assignment.week3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String input = "PayPal India";
		char[] charArr = input.toCharArray();
		System.out.println(charArr);
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (Character eachValue : charArr)
		{
		  charSet.add(eachValue);
			
		}
		
		for (Character character : charSet) {
			
			if(character!= ' ') {
				
				System.out.println(character);
				
			}
		}
		
	}

}
