package week1.day1;

import java.util.Scanner;


public class Primenumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		int m = 0;
		m = a/2;
		int flag = 0;
		if(a==0 || a==1) {
			
			System.out.println("Not a Prime Number");
			
		}
		
		else {
	     
	     for (int i = 2; i <= m; i++) {
	    	 
	    	 if(a%i == 0) {
	    		 
	    		 System.out.println("Not a Prime Number");
	    		 flag = 1;
	    		 break;
	    		 
	    	 } 		
	    	 
		}
		}	
	if(flag==0) {
		
		 System.out.println("is a Prime Number");
		
	}

	}

}
