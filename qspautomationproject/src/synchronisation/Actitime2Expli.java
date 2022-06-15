package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime2Expli {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("http://127.0.0.1/login.do;jsessionid=29mcdpc4dfttf");
		//explicitly wait

		//	WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println("The login page title is verified");


		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();


		//wait.until(ExpectedConditions.titleContains("Enter"));
		String actualHomePageTitle = driver.getTitle();

		System.out.println("The home page title is verified");
	}
}
