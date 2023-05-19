package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathMethodOrAnd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?r=101");
		//true or true =true
		//true or false=true
		//false or true= true
		//false or false= false	
		driver.findElement(By.xpath("//input[@type='text'and @name='reg_email__']")).sendKeys("suneeGuj@1112");

	}

}
