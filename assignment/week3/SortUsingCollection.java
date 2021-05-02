package assignment.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUsingCollection {

	
	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> value = new ArrayList<String>();
		for(String eachValue : input)
		{
			value.add(eachValue);
		}
		
		Collections.sort(value);
		System.out.println(value);
		Collections.reverse(value);
		System.out.println(value);
	
		
		
		
		
		
		

	}
}
