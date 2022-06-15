package javaScriptExecutorOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/My%20pc/OneDrive/Desktop/Html/Disabled.html");
		Thread.sleep(5000);

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('i1').value='admin'");
		driver.findElement(By.id("i2")).sendKeys("manager");
	}
}
