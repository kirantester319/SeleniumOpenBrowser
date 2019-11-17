package Maven.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test2 {
	
	
	
	@Test
	public void iframes()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:/SetUps/chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_forms.asp");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOf(element));
		int totalFrames = driver.findElements(By.tagName("iframes")).size();
		
		System.out.println("Total iframes is "+ totalFrames);
		
		
		
	}

}
