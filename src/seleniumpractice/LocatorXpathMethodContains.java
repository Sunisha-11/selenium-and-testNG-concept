package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathMethodContains {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");	
		
	String data=driver.findElement(By.xpath("//label[contains(text(),'Email')]")).getText();
	//Relative xpath by...contains          //tagName[contains(text(),'value')]
	
	System.out.println(data);

	}

}
