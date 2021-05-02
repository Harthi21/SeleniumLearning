package assignment.week1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
	  
		int[] arr = {1,2,3,4,7,6,8};
			
		int n = arr.length;
		
		int sumofAll = n*(n+1)/2;
		
		int sumOfArray= 0;
		
		for (int i = 0; i < n-1; i++) {
			
			sumOfArray = sumOfArray + arr[i];
			
		}
		
		int missingNumber = sumofAll- sumOfArray;
		System.out.println("Missing Number is " + missingNumber);
			
			
				
			
		}
		
		
			
		}

	


