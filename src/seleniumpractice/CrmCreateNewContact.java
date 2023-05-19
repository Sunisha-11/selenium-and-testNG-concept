package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CrmCreateNewContact {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SQL\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedway2023");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Speedway@2023");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().frame("mainpanel");
		WebElement contacts = driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(contacts).build().perform();
		driver.findElement(By.linkText("New Contact")).click();
		
		WebElement Title =driver.findElement(By.name("title"));
		
		Select sel=new Select(Title);
		sel.selectByVisibleText("Mrs.");
		
		driver.findElement(By.cssSelector("#first_name")).sendKeys("Sunisha");
		driver.findElement(By.cssSelector("#middle_initial")).sendKeys("Neeraj");
		driver.findElement(By.cssSelector("#surname")).sendKeys("Gujarathi");
		
		WebElement Suffix =driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[2]/select"));
		Select sel1=new Select(Suffix);
		sel1.selectByVisibleText("Jr.");
		
		driver.findElement(By.xpath("//input[@name='nickname']")).sendKeys("Sunee");
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[2]/input[4]")).click();
		
		
		//for lookup window handle
		
		

		
		//driver.findElement(By.cssSelector("#search")).sendKeys("Infosys");
		//cssSelector by classname(.classname n spaces replaced by .)
		
		//for lookup window
		String pwh= driver.getWindowHandle();
		Set<String>windows = driver.getWindowHandles();
		for(String win:windows)
		{	
		if(!win.equals(pwh))
		{
			driver.switchTo().window(win); 
		}
		}
		driver.findElement(By.cssSelector("#search")).sendKeys("Infosys");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//td[@valign='top'])[4]")).click();
		driver.findElement(By.linkText("Infosys")).click();
		
		//psition Name
		
		driver.switchTo().window(pwh);
		driver.switchTo().frame("mainpanel");
		
		//for position
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("TeamLeader");
		driver.findElement(By.name("department")).sendKeys("Testing");
		driver.findElement(By.name("contact_lookup_sup")).sendKeys("Sujeet Sir");
		driver.findElement(By.name("contact_lookup_ass")).sendKeys("Mr.xyz");
		driver.findElement(By.name("contact_lookup_ref")).sendKeys("Miss Dhanashri");
		
		//for Category
		WebElement Category =driver.findElement(By.xpath("//select[@name='category']"));
		Select sel2=new Select(Category);
		sel2.selectByVisibleText("Friend");
		
		//for status
		WebElement status =driver.findElement(By.xpath("//select[@name='status']"));
		Select sel3=new Select(status);
		sel3.selectByVisibleText("New");
		
		driver.findElement(By.id("phone")).sendKeys("1234567810");
		driver.findElement(By.id("mobile")).sendKeys("9766123411");
		driver.findElement(By.id("home_phone")).sendKeys("0253-123456");
		driver.findElement(By.id("fax")).sendKeys("12358974");
		driver.findElement(By.id("email")).sendKeys("sunishagujarathi@gmail.com");

		
	//	Set<String>windows1=driver.getWindowHandles();
	//	for(String win1:windows1)
	//	{
			
	//	if(!win1.equals(pwh))
	//	{
	//		driver.switchTo().window(win1); 
	//	}
	//	}
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc xyz (Infosys)");
	//	driver.findElement(By.xpath("(//input[@class='button'])[2]")).click();
	//	driver.findElement(By.linkText("abc xyz (Infosys)")).click();
	//	driver.findElement(By.linkText("Infosys")).click();
		
		
		//driver.findElement(By.cssSelector("#search")).click();
		
		//driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).click();
		
	}

	
}
