package assignmentusingMouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.findElement(By.id("denyBtn")).click();

		Thread.sleep(4000);

		WebElement targetTomouseHover = driver.findElement(By.xpath("//p[@class='lc-1mwyrdx e16i86ec0']"));
		Actions act=new Actions(driver);
		act.moveToElement(targetTomouseHover).perform();
	}
}
