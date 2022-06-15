package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=4r9kcbgn5t26h");
		
		WebElement usernameTextBox=driver.findElement(By.name("username"));
		usernameTextBox.sendKeys("admin");
		System.out.println(usernameTextBox);
		WebElement passwordTextBox = driver.findElement(By.name("pwd"));
		passwordTextBox.sendKeys("manager");

	}

}
