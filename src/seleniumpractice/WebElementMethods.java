package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//first textbox
		driver.findElement(By.cssSelector("[placeholder ='First Name']")).sendKeys("Sunisha");
		//second textbox
		driver.findElement(By.cssSelector("[placeholder ='Last Name']")).sendKeys("Gujarathi");
		//Address
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("pune");
		//emailid
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("sunee1234@gmail.com");
		//phone no
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234123412");
		//radio buttton
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		//hobbies
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		
		//List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		//for(WebElement box:checkbox)
		//{
		//	if(box.getAttribute("value").equals("Cricket")||box.getAttribute("value").equals("Movies"));
		//	{
		//		box.click();
		//	}
		//}
		//driver.findElement(By.id("Skills")).click();
		
		//for Static dropdown
		WebElement skillsDropDown =driver.findElement(By.id("Skills"));
		Select sel=new Select(skillsDropDown);
		sel.selectByVisibleText("Java");
		
		//for yeardropdown
		WebElement yearDropDown = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
	Select sel1 =new Select(yearDropDown);
	sel1.selectByValue("1988");
	
	//for monthdropdown
	WebElement monthDropDown = driver.findElement(By.cssSelector("[placeholder='Month']"));
	Select sel2 =new Select(monthDropDown);
	sel2.selectByValue("July");
	
	//for daydropdown
	WebElement dayDropDown =driver.findElement(By.cssSelector("[placeholder='Day']"));
	Select sel3=new Select(dayDropDown);
	sel3.selectByIndex(11);
	//for password
	driver.findElement(By.cssSelector("#firstpassword")).sendKeys("sunee&1234");
	//confirm password
	driver.findElement(By.cssSelector("#secondpassword")).sendKeys("sunee&1234");
	//submit button
	driver.findElement(By.cssSelector("#submitbtn")).click();
	

	}

}
