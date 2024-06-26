import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\download\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		//ops.setBinary("/Applications/Google Chrome Beta.app/Contents/MacOS/Google Chrome Beta");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.google.com/");

	}

}
