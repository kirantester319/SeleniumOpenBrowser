package Maven.Project;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.testng.annotations.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakesScreenShotByCoordinates {
	


	
	@Test
	public void ScreenShot() throws Exception
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Project\\Drivers\\chromedriver2.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://en.wikipedia.org/wiki/Oxygen");
	
	
	Thread.sleep(5000);
	WebElement element = driver.findElement(By.className("infobox"));
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	BufferedImage fullImage = ImageIO.read(source);
	
	Point point = element .getLocation();
	
	int width = element.getSize().getWidth();
	
	int height = element.getSize().getHeight();
	
	BufferedImage screenshot = fullImage.getSubimage(point.getX(), point.getY(), width, height);
	
	FileUtils.copyFile(source, new File("C:\\Users\\hp\\eclipse-workspace\\Project\\ScreenShot\\file1.png"));
	
	
}
}


