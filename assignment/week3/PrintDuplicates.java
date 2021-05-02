package assignment.week3;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
		ArrayList<Integer> values = new ArrayList<Integer>(); 
		for (Integer orgValue : data) {
			values.add(orgValue);
			
		}

		System.out.println("Original Values: " + values);
			
		Set<Integer> firstSet = new HashSet<Integer>();
		Set<Integer> secondSet = new HashSet<Integer>();
		for (Integer n : values) {
           if(!firstSet.add(n)) {
        	   secondSet.add(n);
        	   
        	   
           }

		}

		System.out.println("Duplicate Values: " + secondSet);
		System.out.println(" Values: " + firstSet);		
		
		

	}

}
