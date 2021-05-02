package week1.day1;

public class Mobile {
	
	String mobileModel = "Nokia";
	int mobileWeight = 20;
	boolean isFullCharge = false;
	double mobileCost = 15000;
	
	
	private void makecall() {
		System.out.println("Hello");

	}

	private void sendMsg() {
		System.out.println("Welcome");

	}
	public static void main(String[] args) {
		Mobile samp = new Mobile();
		samp.makecall();
		samp.sendMsg();
		System.out.println(samp.mobileModel);
		System.out.println(samp.mobileWeight);
		System.out.println(samp.isFullCharge);
		double mb = samp.mobileCost;
		System.out.println("Mobile Cost is : " +mb);

	}

}
