package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.* ;

public class ListElements {
	
	
		
		
		@Test
		public void OPenBrowser() throws Exception
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Project\\Drivers\\chromedriver2.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.google.com");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			WebElement element=	driver.findElement(By.name("q"));
			element.sendKeys("Selenium");
			
			List<WebElement> lis=driver.findElements(By.className("UUbT9"));
			
			lis.get(2).click();
			
			
			
			
			
			/*for(WebElement ele :lis)
			{
				int i=0;
				ele=lis.get(i);
				
				System.out.println(ele);
			}*/
			driver.close();
			
			
		}
		
		
		
	}
	
	


