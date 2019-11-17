package Maven.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IFrames {
	
	
	
	
	@Test
	public void Frames() throws Exception
	{
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(1);
		
		
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='KiranKumar'", firstName);
		
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
	}

}
