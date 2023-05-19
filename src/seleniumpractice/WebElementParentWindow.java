package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebElementParentWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedway2016");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Speedway@2016");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().frame("mainpanel");
		WebElement contacts = driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(contacts).build().perform();
		driver.findElement(By.linkText("New Contact")).click();
		
		WebElement Title =driver.findElement(By.name("title"));
		Select sel=new Select(Title);
		sel.selectByVisibleText("Mrs.");
		
		driver.findElement(By.cssSelector("#first_name")).sendKeys("Sunisha");
		driver.findElement(By.cssSelector("#middle_initial")).sendKeys("Neeraj");
		driver.findElement(By.cssSelector("#surname")).sendKeys("Gujarathi");
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("TeamLeader");
	}

}
