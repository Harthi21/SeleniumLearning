package assignment.week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Harthi");
		driver.findElementById("lastNameField").sendKeys("Gnanavel");
		driver.findElementById("createContactForm_departmentName").sendKeys("Technical");
		driver.findElementById("createContactForm_description").sendKeys("Electrical and Electronics");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("harthignanavel@gmail.com");
		WebElement source = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select d1 = new Select(source);
		d1.selectByIndex(6);
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateContactForm_description").clear();
		driver.findElementById("updateContactForm_importantNote").sendKeys("Have a Great Learning");
		driver.findElementByXPath("(//input[@class = 'smallSubmit'])[1]").click();
		String title = driver.getTitle();
		System.out.println("Title of the Resulting Page is: " + title);
		
		
	}

}
