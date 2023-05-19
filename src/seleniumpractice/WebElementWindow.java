package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		String pwh= driver.getWindowHandle();
		System.out.println(pwh);

		
		driver.findElement(By.cssSelector(".btn.btn-info")).click();
		//cssSelector by classname(.classname n spaces replaced by .)
		Set<String>windows=driver.getWindowHandles();
		for(String win:windows)
		{
			
		if(!win.equals(pwh))
		{
			driver.switchTo().window(win); 
		}
		}
		//{
		//	System.out.println(win);
		//}
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		//							//tagname[text()='value']
			}

}
