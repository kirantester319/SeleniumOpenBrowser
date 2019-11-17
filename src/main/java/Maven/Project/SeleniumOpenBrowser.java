package Maven.Project;
import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class SeleniumOpenBrowser {
	
	
	WebDriver driver;
	@Test
	public void OpenBrowser() throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver", "F:/SetUps/chromedriver2.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("http://www.facebook.com");
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		WebElement lastName=driver.findElement(By.name("lastname"));
		
		explicitlyWait(driver, firstname, 10,"Kiran");
			
		explicitlyWait(driver, lastName, 20, "katta");
		//TakeScreenShot("C:\\Users\\hp\\eclipse-workspace\\Project\\ScreenShot\\facebook.png");
	}

	
	
	public void explicitlyWait(WebDriver driver1, WebElement element, int timeouts,String Inputs)
	{
		WebDriverWait wait = new WebDriverWait(driver1,timeouts);
		
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		element.sendKeys(Inputs);
	}
	
	
	public void TakeScreenShot(String ScreenShotFilepath) throws Exception
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		
	File src=	ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(ScreenShotFilepath));
	}
	
	
}
