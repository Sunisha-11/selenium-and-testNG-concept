package TestNGpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PropertiesFileConcept
{
	WebDriver driver;
	Properties prop;
	
	@BeforeMethod
	public void initialization() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\seleniumpractice\\config.properties");
		prop = new Properties();
		prop.load(file);
		System.setProperty("webdriver.chrome.driver", "E:\\SQL\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

	
	@Test
	public void ValidateLoginTests() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
