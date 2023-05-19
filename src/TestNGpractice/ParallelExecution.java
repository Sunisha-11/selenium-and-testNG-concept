package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class ParallelExecution 
	{
		WebDriver driver;
	@BeforeMethod
	public void initialization() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SQL\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void googleSerachTest()
	{
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("parallel Execution");
		
	}
	@Test
	public void yahooSearchTest()
	{
		
		driver.get("https://in.search.yahoo.com/?guccounter=1&guce_referrer=aHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8&guce_referrer_sig=AQAAAJAJI6u7-spDq9jVRCK8CWb1nYEFtZDg6Wfp9dnXPn1ornwIdsxXQMc9sTmYVnSyDHf8afPxdkRbHcqNJgbiCZwZJpJqxYOhLkk0A0z46U7pJc--EAiV8RUYdD42oL0JSc-rwR0hiyDUqtXgoOnxPXBF9AJEAfLcrm67NaKxWHhj");
	driver.findElement(By.name("p")).sendKeys("parallel Execution");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		
		
		
		
		
	}
}
