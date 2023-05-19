package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAlertOkAndCancel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
	
		Alert alt =driver.switchTo().alert();
		String alertText = alt.getText();
		alt.accept();
		//alt.dismiss();
		System.out.println(alertText);
		String labelText = driver.findElement(By.id("demo")).getText();
		if (labelText .contains("ok"))
		{
			System.out.println("we clicked on ok button");
			
		}
		else
		{
			System.out.println("we clicked on cancel button");
		}
		
		
	
	}

}
