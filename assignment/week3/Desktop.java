package assignment.week3;

public class Desktop extends Computer {
	
	public void desktopSize() {
		
		System.out.println("Desktop Size: Normal");

	}

	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		obj.desktopSize();
		obj.computerModel();
		

	}

}
