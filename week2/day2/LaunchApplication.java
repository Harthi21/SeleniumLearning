package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class= 'decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains (text(), 'CRM')] ").click();
		driver.findElementByXPath("//a[contains (text(), 'Leads')] ").click();
		driver.findElementByXPath("//a[contains (text(), 'Create Lead')] ").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Tech Mahindra");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Harthi");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Gnanavel");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		
		
		

		
		
		
		
		
		

	}

}
