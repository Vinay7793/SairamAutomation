package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/?hl=en");
		
		driver.findElement(By.name("username")).sendKeys("Vinay");
		driver.findElement(By.name("password")).sendKeys("Vinay@123");
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();

	}

}
