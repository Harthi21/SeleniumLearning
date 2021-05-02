package assignment.week1;

public class CharOccurence {

	public static void main(String[] args) {
		
		String text = "welcome to chennai";
		char[] ch = text.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]=='e') {
				
				count++;
			}
		}
		
       System.out.println("Occurence of Character e is " + count);
	}

}
