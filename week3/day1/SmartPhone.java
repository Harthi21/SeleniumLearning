package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsApp() {

		System.out.println("Connect WhatsApp");
	}
	
	public void takeVideo() {

		System.out.println("Shoot Video");
	}
	
	public static void main(String[] args) {
		
		SmartPhone obj = new SmartPhone();
		obj.connectWhatsApp();
		obj.takeVideo();
		obj.sendMsg();
		obj.makeCall();
		obj.saveContact();
		
		

	}

}
