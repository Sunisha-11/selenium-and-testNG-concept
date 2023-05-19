package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathContains2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/home");
		driver.findElement(By.cssSelector("a[role=button]")).click();
		
driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).click();
Thread.sleep(5000);

//Relative xpath by attribut //tagname[contains(@attribut,'value')]
driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).sendKeys("sunisha");	
	}

}
