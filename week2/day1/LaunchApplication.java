package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Tech Mahindra");
		driver.findElementById("createLeadForm_firstName").sendKeys("Harthi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Gnanavel");
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("Employee");
		driver.findElementByClassName("smallSubmit").click();
		driver.close();
		
		
		
		
		

	}

}
