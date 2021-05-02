package assignment.week3;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaProductSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement search1 = driver.findElementByName("search-suggestions-nykaa");
		search1.sendKeys("Perfumes", Keys.ENTER);
		
	java.util.List<WebElement> title = driver.findElements(By.xpath("//div[@class='m-content__product-list__title']"));
//		Thread.sleep(1000);
//		System.out.println(title.size());
//		
//		for (WebElement webElement : title) {
//			
//			String name = webElement.getText();
//			System.out.println("Perfumes Title: " + name);
//		}
		
	java.util.List<WebElement> price = driver.findElements(By.className("post-card__content-price-offer"));
//		
//		System.out.println(price.size());
//        for (WebElement n : price) {
//			
//			String priceAmt = n.getText();
//			System.out.println("Perfumes Price: " + priceAmt);
//		}
        WebElement selectPerfume = driver.findElementByXPath("//span[contains(text(),'Nykaa Love Struck Perfume')]");
        executor.executeScript("arguments[0].click();", selectPerfume);
        WebElement addBag = driver.findElement(By.xpath("//button[text()='ADD TO BAG']"));
        executor.executeScript("arguments[0].click();", addBag);

       
        WebElement search2 = driver.findElementById("SearchInputBox");
		search2.sendKeys("Sunglasses", Keys.ENTER);
		java.util.List<WebElement> title2 = driver.findElements(By.xpath("//div[@class='m-content__product-list__title']/h2"));
//		System.out.println(title2.size());
//		
//		for (WebElement webElement2 : title2) {
//			
//			String name2 = webElement2.getText();
//			System.out.println("Sun Glasses Title: " + name2);
//		}
//		
 	   java.util.List<WebElement> price2 = driver.findElements(By.className("post-card__content-price-offer"));
//		
//		System.out.println(price2.size());
//        for (WebElement n2 : price2) {
//			
//			String priceAmt2 = n2.getText();
//			System.out.println("Sun Glasses Price: " + priceAmt2);
//		}
//        
      WebElement selectGlass = driver.findElementByXPath("//span[contains(text(),'Enrico Walferty Transparent UV protected Polarized Aviator M...')]");
      executor.executeScript("arguments[0].click();", selectGlass);
      WebElement addGlass = driver.findElement(By.xpath("//button[text()='ADD TO BAG']"));
      executor.executeScript("arguments[0].click();", addGlass);
      
      WebElement addToCart = driver.findElementByXPath("//div[@class='AddBagIcon']");
      executor.executeScript("arguments[0].click();", addToCart);


		
}
}
