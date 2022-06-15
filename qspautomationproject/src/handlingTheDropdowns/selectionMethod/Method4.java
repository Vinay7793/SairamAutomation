package handlingTheDropdowns.selectionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Method4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/My%20pc/OneDrive/Desktop/Html/Multiple%20select%20dropdown.html");

		WebElement dropdownwebelemet = driver.findElement(By.id("menu"));
		Select sel=new Select(dropdownwebelemet);

		for (int i=0;i<=7;i++){
			sel.selectByIndex(i);
			Thread.sleep(4000);
		}

	}

}
