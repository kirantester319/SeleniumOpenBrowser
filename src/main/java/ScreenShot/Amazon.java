package ScreenShot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Amazon {
	
	
	WebDriver driver;
	
	@Test
	public void OPenBrowser() throws Exception
	
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Project\\Drivers\\chromedriver2.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/Oxygen");
		
		
		WebElement element =driver.findElement(By.className("infobox"));
		
		TakeScreenShot("oxygen", element);
		
		
	}
	
	
	
	
	
	
	
	
	//Implicitly wait
	
	public void impliciteWait(int TimeOut)
	{
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
	}
	
	//Explicitly Wait 
	
	public void ExplicitelyWait(WebDriver driver, int Timeout,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Timeout);
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void TakeScreenShot(String Filename,WebElement element) throws Exception
	{
	
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		Point point = element.getLocation();
		
		BufferedImage fullImage= ImageIO.read(source);
		
		int widthimg= element.getSize().getWidth();
		Thread.sleep(10000);
		Actions act = new Actions(driver);
		
		act.moveByOffset(1558, 2075).build().perform();
		
		
		
		
		int heightimg= element.getSize().getHeight();
		
		
		
		BufferedImage snipIma=fullImage.getSubimage(point.getX(), point.getY(), widthimg, heightimg);
		
		FileUtils.copyFile(source, new File("C:\\Users\\hp\\eclipse-workspace\\Project\\ScreenShot" +Filename+".png"));
		
		
		
		
		
		
		
	}
	
	

}
