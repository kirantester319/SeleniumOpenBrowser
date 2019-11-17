package Maven.Project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutomationPracticeProject {
	
	
	
	
	@Test
	public void OpenBrowser()throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Project\\Drivers\\chromedriver2.exe");
		WebDriver driver  = new FirefoxDriver();
		
		driver.get("http://www.automationpractice.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		
		
		driver.findElement(By.className("login")).click();
		Thread.sleep(5000);
		//UserID
		driver.findElement(By.id("email")).sendKeys("jetblue@grr.la");;
		driver.findElement(By.id("passwd")).sendKeys("jetblue");;
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
		//Tshirt
		Thread.sleep(10000);
		//Tshirt Button Click
		driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a")).click();
		//Select Shirt
		WebElement element=	driver.findElement(By.cssSelector("#center_column > ul > li > div"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		
		//Add to cart
		
		driver.findElement(By.linkText("Add to cart")).click();
		
		
		
		System.out.println(driver.switchTo().alert().getText()) ;
			

		String parentWindow = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> itr = windowHandles.iterator();
		
		while(itr.hasNext())
		{
			String childWindow = itr.next();
			
			driver.switchTo().window(childWindow);
			
			System.out.println(driver.switchTo().window(childWindow).getTitle()) ;
			
			Thread.sleep(10000);
			driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")).click();
		
		
		//Proceed to cart
			WebElement cart2=	driver.findElement(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span"));
		
		act.moveToElement(cart2).build().perform();
		cart2.click();
		
		
		
		
		WebElement cart3= driver.findElement(By.cssSelector("#center_column > form > p > button > span"));
		
		act.moveToElement(cart3).build().perform();
		cart3.click();
		
		
		
		}
		
		
		
		
		
				
				
		
	}

}
