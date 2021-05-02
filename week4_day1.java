import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week4_day1 {

	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms", Keys.ENTER);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu", Keys.ENTER);
		driver.findElementById("chkSelectDateOnly").click();
		
		List<WebElement> rowCount = driver.findElementsByXPath("//table[@class ='DataTable TrainList TrainListHeader']//tr");
		int rowSize = rowCount.size();
	    System.out.println(rowSize);
	    
	    List<WebElement> dataCount = driver.findElementsByXPath("//table[@class ='DataTable TrainList TrainListHeader']//tr[1]/td");
	    int dataSize = dataCount.size();
	    System.out.println(dataSize);
	    
	    for (int i = 1; i <= rowSize; i++) {
	    	
	    	for (int j = 2; j <=dataSize; j++) {
	    		
	    		 List<WebElement> trainName = driver.findElementsByXPath("//table[@class ='DataTable TrainList TrainListHeader']//tr["+i+"]/td["+j+"]");
	    		 System.out.println(trainName);
				
			}
			
	    	
		}
	    
		
	}	
		
	
	}


