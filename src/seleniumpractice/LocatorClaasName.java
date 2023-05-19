package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClaasName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.className("form-control")).sendKeys("sunishsa1112@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Abirovi11");
		Thread.sleep(5000);
		driver.quit();
	}

}
