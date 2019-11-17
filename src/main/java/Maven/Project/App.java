package Maven.Project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class App 
{
    @Test
    public void WindowHandle()
    {
      System.setProperty("webdriver.chrome.driver", "F:/SetUps/chromedriver2.exe");
      
      WebDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
      
      driver.get("http://www.flipkart.com");
      
      String parentWindow = driver.getWindowHandle();
      
      Set<String> windowhandles=driver.getWindowHandles();
      
      Iterator<String> itr = windowhandles.iterator();
      
      while(itr.hasNext())
      {
    	  String childWindow = itr.next();
    	  
    	  driver.switchTo().window(childWindow);
    	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("kirankumar");
    	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("nagajyothi");
    	  
    	 // driver.findElement(By.linkText("//span[contains(text(),'Login')]")).sendKeys(Keys.RETURN);
    	  
    	  
      }
    }
}
