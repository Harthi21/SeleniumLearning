package assignment.week3;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement search = driver.findElementById("twotabsearchtextbox");
		search.sendKeys("Redmi mobiles");
		search.sendKeys(Keys.ENTER);
		java.util.List<WebElement> title = driver.findElementsByXPath("//span[@class='a-size-medium a-color-base a-text-normal']/..");
		System.out.println(title.size());
		for (WebElement webElement : title) {
			
			String name = webElement.getText();
			System.out.println(name);
			
		}
		java.util.List <WebElement> price = driver.findElementsByClassName("a-price-whole");
		System.out.println(price.size());
		for (WebElement webElement : price) {
			
			
			String priceName = webElement.getText();
			System.out.println(priceName);
			
		}
		
		java.util.List <WebElement> newPrice = new ArrayList();
		newPrice.addAll(price);
		Collections.sort(newPrice);
		
		
		
		
	}

}
