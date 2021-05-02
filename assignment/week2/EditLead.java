package assignment.week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElementByXPath("(//input[@name = 'firstName'])[3]").sendKeys("Hema");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(10000);
		driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		String newName = "TCS";
		driver.findElementById("updateLeadForm_companyName").sendKeys(newName);
		driver.findElementByXPath("//input[@class = 'smallSubmit']").click();
		String companyName = driver.findElementById("viewLead_companyName_sp").getText();
		Thread.sleep(10000);
		if(companyName.contains(newName)) {
			
			System.out.println("Changed Company Name Successfully");
		}
		else 
		{
			System.out.println("Company Name not changed successfully");
		}
		
		driver.close();

	}
	
}

        