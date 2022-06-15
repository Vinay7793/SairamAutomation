package operationalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/My%20pc/OneDrive/Desktop/Html/Multiple%20select%20dropdown.html");
		
		WebElement dropdownelement = driver.findElement(By.id("menu"));
		Select sel=new Select(dropdownelement);
		
		for (int i=3;i<=7;i++)
		{
			sel.selectByIndex(i);
		}
		
		List<WebElement> allops = sel.getAllSelectedOptions();
		for (WebElement we: allops)
		{
			String ops = we.getText();
			System.out.println(ops);
		}
	}

}
