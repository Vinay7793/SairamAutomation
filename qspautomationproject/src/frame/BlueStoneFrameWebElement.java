package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrameWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();

		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='chat-widget']"));
		driver.switchTo().frame(frameElement);

		WebElement chatWithourExperts = driver.findElement(By.xpath("//button[@aria-label='Open LiveChat chat widget']"));
		chatWithourExperts.click();
	}
}
