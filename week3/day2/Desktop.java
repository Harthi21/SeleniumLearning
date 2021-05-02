package week3.day2;

public class Desktop implements Software,Hardware {
	
	public void softwareResources() {

		System.out.println("SoftwarevResources");
	}

	public void hardwareResources() {

		System.out.println("Hardware Resources");
	}

	public void desktopModel() {
		
		System.out.println("Desktop Model");

	}

	public static void main(String[] args) {

		Desktop obj = new Desktop();
		obj.softwareResources();
		obj.hardwareResources();
		obj.desktopModel();
	}

	
}
