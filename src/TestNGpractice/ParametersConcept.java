package TestNGpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class ParametersConcept
	{
		WebDriver driver;
		@Parameters("url")
		@BeforeMethod
		public void initialization(String webname)
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(webname);
		}

		@Parameters({"username","password"})
		@Test
		public void ValidateLoginTests(String username,String password) throws InterruptedException
		{
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.cssSelector("[type='submit']")).click();
			Thread.sleep(5000);
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.close();
		}
}
