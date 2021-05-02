package assignment.week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElementByXPath("//span[text() = 'Email']").click();
		driver.findElementByXPath("//input[@name = 'emailAddress']").sendKeys("fststry@gmail.com");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(10000);
	    String str = driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']").getText();
	    System.out.println(str);
	    driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
	    driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
	    Thread.sleep(1000);
	    String title = driver.getTitle();
	    String confTitle = "Duplicate Lead";
	    if(title.contains(confTitle)) {
	    	
	    	System.out.println("Title is verified");
	    }
	    driver.findElementByXPath("//input[@class = 'smallSubmit']").click();
	    Thread.sleep(1000);
	    String fName = driver.findElementById("viewLead_firstName_sp").getText();
	    
	    if(str.equals(fName)) {
	    	
	    	System.out.println("Duplicated lead name is same as captured name");
	    }
	    else {
	    	System.out.println("Duplicated lead name is not same as captured name");
	    }
	    
	    driver.close();
	    	
		

	}

}
