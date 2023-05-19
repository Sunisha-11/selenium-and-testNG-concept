package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodFindelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(5000);
	
	List<WebElement> googleSearchResult = driver.findElements(By.className("gLFyf"));
	int eleSize = googleSearchResult.size();
	System.out.println(eleSize);
	for(int i=0;i<eleSize;i++)
	{
		String value =googleSearchResult.get(i).getText();
	}
	}

}



















































