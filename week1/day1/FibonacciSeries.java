package week1.day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number:");
		int a = sc.nextInt();
		
		int firstNum = 0;
		int secNum = 1;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 2; i<a; i++) {
			
			int sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
			
			
		}                                                    
		
		
		

	}

}
