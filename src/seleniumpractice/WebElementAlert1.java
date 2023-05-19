package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAlert1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.xpath("//input[@id='Register']")).click();
		Alert alt = driver.switchTo().alert();
		String alertText = alt.getText();
						   alt.accept();
		System.out.println(alertText);
		if(alertText.contains("Your full name cannot be blank"))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
 