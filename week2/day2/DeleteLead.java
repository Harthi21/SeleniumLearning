package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name = 'phoneNumber']").sendKeys("3563649");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]/..").click();
		Thread.sleep(10000);
		String str = driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
	    System.out.println(str);
	    driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//a[text() = 'Delete']").click();
		Thread.sleep(1000);
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name = 'id' and @class=' x-form-text x-form-field']").sendKeys(str);
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(10000);
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		String str1 = driver.findElementByXPath("//div[text()='No records to display']").getText();
	    String output = "No records to display";
				if(str1.equals(output) ) {
					
					System.out.println("Successfully deleted the records");
					
				}
				else {
					
					System.out.println("Not deleted ");
				
				
				}
				
				driver.close();
	    




		
		
		
	}
}

		


		
	


