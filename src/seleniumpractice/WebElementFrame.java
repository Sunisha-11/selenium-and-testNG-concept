package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFrame {

	
		public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Frames.html");
			
				driver.switchTo().frame("SingleFrame");//name
			//driver.switchTo().frame("0");
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("speedway");

	}

}
