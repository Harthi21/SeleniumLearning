package week2.day1;

import java.awt.Dimension;
import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToIntractDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElementById("dropdown1");
		Select d1 = new Select(source);
		d1.selectByIndex(3);
		
		WebElement source1 = driver.findElementByName("dropdown2");
		Select d2 = new Select(source1);
		d2.selectByVisibleText("Selenium");
		
		WebElement source2 = driver.findElementByName("dropdown3");
		Select d3 = new Select(source2);
		d3.selectByValue("2");
		
		WebElement source3 = driver.findElementByName("dropdown3");
		Select d4 = new Select(source3);
		java.util.List<WebElement> a = d4.getOptions();
		System.out.println("DropDown OPtions are: " + a);
		int b = a.size();
		System.out.println("The Number of DropDown Options are: " + b);
		
		WebElement source4 = driver.findElementByXPath("//option[text() = 'You can also use sendKeys to select']/..");
		Select d5 = new Select(source4);
		d5.selectByVisibleText("Appium");
		
		WebElement source5 = driver.findElementByXPath("//option[text() = 'Select your programs']/..");
		Select d6 = new Select(source5);
		d6	.selectByVisibleText("Loadrunner");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
