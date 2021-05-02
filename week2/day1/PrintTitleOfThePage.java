package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTitleOfThePage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");

		driver.manage().window().maximize();
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElementById("password").sendKeys("leaf@12");
		
		driver.findElementByXPath("//button[contains(text(),'Login')]").click();
		
		System.out.println("Title of the page is " + driver.getTitle());
		
		driver.findElementByLinkText("Log Out").click();
		
		Thread.sleep(1000);
		
		driver.close();
		
		
		
	}

}
