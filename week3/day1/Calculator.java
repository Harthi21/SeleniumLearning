package week3.day1;

public class Calculator {
	
	public void add(int a, int b) {
		
		int sum;
		sum = a + b;
		System.out.println("Sum of Two Numbers: " + sum );
	}

	public void add(int a, int b, int c) {
		
		int sum;
		sum = a + b + c;
		System.out.println("Sum of Three Numbers are: " + sum);
    }
	
	public void multiply(int a, int b) {
		
		int result;
		result = a * b;
		System.out.println("Multiplication of Two Numbers: " + result);
   }
	
    public void multiply(int a, double b) {
		
		double result;
		result = a * b;
		System.out.println("Multiplication of Two Numbers: " + result);
   }
    
    public void subtract(int a, int b) {
		
		int sub;
		sub = a - b;
		System.out.println("Subtraction of Two Numbers: " + sub);
   }
    
   public void subtract(double a, double b) {
		
		double sub;
		sub = a - b;
		System.out.println("Subtraction of Two Numbers: " + sub);
   }
   
   public void divide(int a, int b) {
		
		int div;
		div = a/b;
		System.out.println("Division of Two Numbers: " + div);
  }
   
   public void divide(double a, int b) {
		
		double div;
		div = a/b;
		System.out.println("Division of Two Numbers: " + div);
 }
    
   
    
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		obj.add(5, 4);
		obj.add(2, 2, 2);
		obj.multiply(3, 10);
		obj.multiply(4, 23.5);
		obj.subtract(50, 5);
		obj.subtract(45.8, 23.5);
		obj.divide(40, 4);
		obj.divide(60.90, 5);
		

		
	}

}
