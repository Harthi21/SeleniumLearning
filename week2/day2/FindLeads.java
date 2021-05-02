package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLeads{

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
		driver.findElementByXPath("//a[contains (text(), 'Find Leads')] ").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a");
		
		
		
		

		
		
		
		
		
		

	}

}
