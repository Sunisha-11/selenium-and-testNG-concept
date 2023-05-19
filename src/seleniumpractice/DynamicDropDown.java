package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(1000);
		
		List<WebElement> searchResult = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		int numberofElement=searchResult.size();
			System.out.println(numberofElement);
			
			for (WebElement element:searchResult )
			{
				String elementTxt = element.getText();
				System.out.println(elementTxt);
				if(elementTxt.contains("selenium testing"))
				{
					element.click();
					break;
				}
			}
		
		
	}

}
