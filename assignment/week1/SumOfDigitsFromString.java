package assignment.week1;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		
		String text = "Tes12Le79af65";
		char[] ch = text.toCharArray();
		int sum = 0;
		
		for (int i = 0; i < ch.length; i++) {
			
			if (Character.isDigit(ch[i])){
				
				int a = Character.getNumericValue(ch[i]);
				sum = sum + a;
			    
			}
		
		
		}
		
		System.out.println("Sum of Digits from String is " + sum);

	}

}
