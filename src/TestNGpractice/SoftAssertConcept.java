


package TestNGpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertConcept
{
	WebDriver driver;
	SoftAssert soft;
	//SoftAssert 
	@BeforeMethod
	public void intialization()
	{
		soft = new SoftAssert();
	System.setProperty("webdriver.chrome.driver", "E:\\SQL\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void validateTitleandLogoTest()
	{
		String Title =driver.getTitle();
		soft.assertEquals(Title, "OrangeHRM");
		boolean logostatus = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
		soft.assertEquals(logostatus, true);
		System.out.println("logo is displayed");
		soft.assertAll();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}

