package week1.day2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
        Scanner obj = new Scanner(System.in);
		
		System.out.println("Print number:");
		
		int input = obj.nextInt();
		
		int cal = 0, rem, org;
		
		org = input;
		
		while(input>0) {
			rem = input%10;
			cal = cal + (rem*rem*rem);
			input = input/10;
		}
		
		if(cal==org){
			System.out.println("Armstong Number");
		
	}
	     else
	
	       {
		     System.out.println("Not a Armstrong Number");
		
			
			
		}

	}

}
