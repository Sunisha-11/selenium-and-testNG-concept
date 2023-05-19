package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");	
		
	String data=driver.findElement(By.xpath("//h2[text()='Register']")).getText();
	
	// 					xpath by text	    //tagName[text()='value']
	
	System.out.println(data);
		if(data. contains("Register"))
		{
			System.out.println("we are redirected on register page");
		}
	}

}
