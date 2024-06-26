import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsProgram {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.id("userid")).sendKeys("saylipathade@gmail.com");
		//driver.findElement(By.id("signin-continue-btn")).click();
		//driver.findElement(By.id("pass")).click();
		//driver.findElement(By.className("floating-label")).sendKeys("Ram$12345");
		//driver.findElement(By.xpath("//input[contains(text(),'password')]")).sendKeys("Ram$12345");
		//*[@id="pass"]
		//driver.findElement(By.id("pass")).sendKeys("Ram$12345");
		
		
	}

}
