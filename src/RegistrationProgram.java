import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegistrationProgram
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\download\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://signup.ebay.co.uk/pa/crte?ru=https%3A%2F%2Fwww.ebay.co.uk%2F#");
		
		driver.findElement(By.id("firstname")).sendKeys("Priya");
		driver.findElement(By.id("lastname")).sendKeys("ABC");
		driver.findElement(By.id("Email")).sendKeys("pv1005497@google.com");
		driver.findElement(By.id("password")).sendKeys("Krishna$12345");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#EMAIL_REG_FORM_SUBMIT")).click();

	}

}
