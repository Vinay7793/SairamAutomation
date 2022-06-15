package assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QH3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();

		String parentTitle = driver.getTitle();

		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();

		for (String wh: allHandles) {

			String currentTitle = driver.switchTo().window(wh).getTitle();
			if (!parentTitle.equals(currentTitle)) {
				driver.switchTo().window(wh).manage().window().maximize();
			} else {
				driver.switchTo().window(wh).close();
			}
		}

	}
}
