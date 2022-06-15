package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/My%20pc/OneDrive/Desktop/Html/Text%20box2.html");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		
	}

}
