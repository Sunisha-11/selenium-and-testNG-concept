package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivermethodsChkBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationt0esting.in/Register.html");

		//driver.findElement(By.id("checkbox1")).click();
		//driver.findElement(By.id("checkbox2")).click();
		//driver.findElement(By.id("checkbox3")).click();
											//relativexpath	.....		  //tagname[@attribute='value']	
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement box:checkbox)
		{
			if(box.getAttribute("value").equals("Cricket")||box.getAttribute("value").equals("Movies"))
			{
				box.click();
			}
		}
	}

}
