package assignment.week1;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		
		int sum = 0;
		
		while(a>0) {
			
			int rem = a%10;
			//System.out.println(rem);
			sum = sum +rem;
			//System.out.println(sum);
			a = a/10;
			
		}
		System.out.println("Sum is " + sum);

	}

}
