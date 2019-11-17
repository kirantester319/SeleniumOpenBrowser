package DataDriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
public class TestBase {
	
	WebDriver driver;
	
	
	@Test(dataProvider="data")
	
	public void CrossBrowser(String username,String password) throws Exception
	{
		
		//Open Chrome Browser
		
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Project\\Drivers\\chromedriver2.exe");
			
			driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("http://www.facebook.com");
			
			driver.findElement(By.name("email")).sendKeys(username);;
			
			driver.findElement(By.name("pass")).sendKeys(password);
			
			driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
				
			
			driver.close();
			
	
	}
	
	
	
	@DataProvider
	public  Object[][] data() throws IOException
	{
		
		Object[][] obj = new Object[4][2];
		
		
		
		obj[0][0]="Username1";
		obj[0][1]="password1";
		obj[1][0]="Username2";
		obj[1][1]="password2";
		obj[2][0]="Username3";
		obj[2][1]="password3";
		obj[3][0]="Username4";
		obj[3][1]="password4";
		
				
		return obj;
		
	}
	
	
	
	
}
		
	


