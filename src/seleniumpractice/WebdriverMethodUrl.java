package seleniumpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Index.html");
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
