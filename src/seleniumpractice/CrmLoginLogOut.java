package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrmLoginLogOut {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SQL\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedway2023");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Speedway@2023");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).click();
		
	
	
	
	}

}
