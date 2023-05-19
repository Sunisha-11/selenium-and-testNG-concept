package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		List<WebElement> SelectCountry = driver.findElements(By.xpath("//li[@role='treeitem']"));
	
		int numberofElements= SelectCountry.size();
	{
		System.out.println(numberofElements);
		
		for (WebElement element: SelectCountry )
		{
			String elementTxt = element.getText();
			System.out.println(elementTxt);
			if(elementTxt.contains("India"))
			{
				element.click();
				break;
			}
		}
	}
	
	}
}
