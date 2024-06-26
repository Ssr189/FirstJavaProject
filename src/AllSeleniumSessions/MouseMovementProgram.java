package AllSeleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementProgram {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\download\\chromedriver1-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(5000));
		driver.get("https://www.spicejet.com/");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='react-root']/div[@id='main-container']/descendant::div[text()='Add-ons']"))).build().perform();
		
		//driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")).click();

		driver.findElement(By.xpath("//div[@id='react-root']/div[@id='main-container']/descendant::div[text()='Friends and Family' and @class='css-76zvg2 r-homxoj r-ubezar']")).click();
		//driver.navigate().back();
	
		driver.findElement(By.xpath("//div[@id='react-root']/div[@id='main-container']/descendant::div[text()='Travel Assistance Services']")).click();
		driver.findElement(By.xpath("//div[@id='react-root']/div[@id='main-container']/descendant::div[text()='SpiceCafé' and @class='css-76zvg2 r-homxoj r-ubezar']")).click();
		
		//driver.findElement(By.xpath("//div[@id='react-root']/div[@id='main-container']/descendant::div[text()='International Connection Baggage']")).click();
		
		driver.findElement(By.xpath("//div[@id='react-root']/div[@id='main-container']/descendant::div[text()='Hotels']")).click();
		
		
	}

}
