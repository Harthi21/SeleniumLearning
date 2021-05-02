package week1.day2;

public class Calculator {

	private int add(int x, int y) {
	  
		int sum;
		sum = x + y;
		return sum;

	}
	private double sub(double x, double y) {
		
		double subt;
		subt = x - y;
		return subt;
		

	}
	private double mul(double x, double y) {
		
		double result ;
		result = x*y;
		return result;
		

	}
	private int Divide(int x, int y) {
		int div;
		div = x/y;
		return div;

	}
	public static void main(String[] args) {
	  Calculator cal = new Calculator();
	  System.out.println(cal.add(5, 3));
	  System.out.println(cal.sub(10, 5));
	  System.out.println(cal.mul(4, 8));
	  int divResult = cal.Divide(50, 10);
	  System.out.println(divResult);
	  

	}

}
