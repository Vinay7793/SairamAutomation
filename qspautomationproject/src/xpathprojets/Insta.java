package xpathprojets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8880715544");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vinay@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
