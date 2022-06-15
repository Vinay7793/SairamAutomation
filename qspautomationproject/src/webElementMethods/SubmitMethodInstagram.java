package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethodInstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/?hl=en");

		Thread.sleep(4000);

		//login operations

		driver.findElement(By.name("username")).sendKeys("Vinay");
		driver.findElement(By.name("password")).sendKeys("vinay@123");
		WebElement loginButton = driver.findElement(By.cssSelector("button[class*='L3NKy']"));
		loginButton.submit();
	}
}
