package TestNGListners;


import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ListeneresClass {
	
	
	
	
	@Test
	public void OpenBrowserFirefox()
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.google.com");
		
		String expected = driver.getTitle();
		
		Assert.assertEquals(expected, "Google");
		driver.close();
		
	}
@Test
	public void OpenBrowserChrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Project\\Drivers\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.google.com");
		
		String expected = driver.getTitle();
		
		Assert.assertEquals(expected, "Googleee");
		driver.close();
	}
}
