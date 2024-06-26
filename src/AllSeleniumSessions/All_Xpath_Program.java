package AllSeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class All_Xpath_Program {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.mycarhelpline.com/");
		driver.findElement(By.xpath("//div[@id='bluemenu']/child::ul[1]/child::li[5]/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@id='bodycontainer-innerpage']/child::div[@class='innerpage-bodycontainer-left']/child::div[1]/child::table[1]/descendant::img[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='bodycontainer-innerpage']/child::div[@class='innerpage-bodycontainer-left']/child::div[1]/child::table[1]/descendant::img[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='bodycontainer-innerpage']/child::div[@class='innerpage-bodycontainer-left']/child::div[1]/child::table[1]/descendant::img[3]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='header-container']/preceding-sibling::table[4]/preceding::img[1]")).click();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//div[@id='header-container']/preceding-sibling::table[3]/preceding::img[1]")).click();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//div[@id='header-container']/preceding-sibling::table[2]/preceding::img[19]")).click();
	    driver.navigate().back();
	    
		
	}
	

}
