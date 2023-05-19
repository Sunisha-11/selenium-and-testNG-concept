package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorcssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sunisha");
										//tagname[attribute='value']
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Kamble");
										//tagname[attribute='value']	
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Nashik");

	}
	//*[@id="basicBootstrapForm"]/div[2]/div/textarea....copy as xpath
}
