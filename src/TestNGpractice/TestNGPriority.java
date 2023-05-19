package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPriority
{
	WebDriver driver;
	@BeforeMethod
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	@Ignore
  @Test(priority = 1)
  public void validateGoogleSearchTest() 
  {
	  driver.findElement(By.name("q")).sendKeys("TestNG");
  }
  @Test(priority = 2)
  public void validateGmaillinkTest()
  {
	  boolean status = driver.findElement(By.linkText("Gmail")).isDisplayed();
	 System.out.println(status);
  }
  @Test(priority = 3,enabled= false)
  public void validateGooglelogoTest()
  {
	  boolean logostatus = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	  System.out.println( logostatus);
  }
  @Test(priority = 4,invocationCount=3)
  public void validateImagelinkTest()
  {
	  boolean imagestatus = driver.findElement(By.linkText("Images")).isDisplayed();
	  System.out.println(imagestatus);
  }
  @AfterMethod
  public void tearDown()
  {
	  driver.close();
  }
}
