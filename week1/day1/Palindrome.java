package week1.day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
        
		int temp = a;
		int sum = 0;
		
		while (a>0) {
		int	r = a%10;
		sum = (sum*10)+r;
		a = a/10;
		  
		}
		
		if(temp==sum) {
			System.out.println(temp+ " is a Palindrome");
		}
			
			else {
				System.out.println(temp+ " not a Palindrome");
		
		}
			
		}

	}


