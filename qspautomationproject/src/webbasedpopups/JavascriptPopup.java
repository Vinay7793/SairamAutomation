package webbasedpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/My%20pc/OneDrive/Desktop/Html/alert.html");

		driver.findElement(By.xpath("//button[.='button']")).click();
		Thread.sleep(5000);
		Alert al = driver.switchTo().alert();
		al.accept();  // or al.dismiss(); 
	}
}
