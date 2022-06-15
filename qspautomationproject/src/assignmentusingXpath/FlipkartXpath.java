package assignmentusingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(4000);
		
		String textOftheWebElement =driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Midnight, 128 GB)']/ancestor::div[@class='_3pLy-c row']/decendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		
		System.out.println(textOftheWebElement);

	}

}
