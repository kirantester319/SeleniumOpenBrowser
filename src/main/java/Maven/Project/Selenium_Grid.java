package Maven.Project;



import java.net.URL;
import java.util.List;

import org.openqa.selenium.Platform;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;


public class Selenium_Grid {
	
	
	
	
	
	@Test
	public void grid() throws Exception
	{
		
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();

		cap.setPlatform(Platform.WINDOWS);
		
		URL url = new URL("http://localhost:4444/wd/hub");
		
		Thread.sleep(10000);
		WebDriver driver = new RemoteWebDriver(url,cap);
		
		driver.get("http://www.google.com");
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		
		
		System.out.println(ele.size());
		
		driver.quit();
		
			
			
		
		
		
	}

}
