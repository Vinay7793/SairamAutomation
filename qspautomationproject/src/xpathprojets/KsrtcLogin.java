package xpathprojets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KsrtcLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/login/show.do");

		driver.findElement(By.xpath("//label[contains(text(),'userName']")).sendKeys("vinay");
		driver.findElement(By.xpath("//label[contains(text(),'password']")).sendKeys("Vinay123");
		driver.findElement(By.xpath("//input[contains(text(),'submitBtn']")).click();

	}

}
