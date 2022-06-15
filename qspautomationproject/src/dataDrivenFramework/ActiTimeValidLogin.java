package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.jsp");

		Thread.sleep(4000);
		
		// accessing the generic reusble non static method by creating the object 
		Flib flib = new Flib();

		// read the username 	
		String username = flib.readExcelData("./data/ActiTimeTestData.xlsx","validcred",1,0);

		// read password 
		String password = flib.readExcelData("./data/ActiTimeTestData.xlsx","validcred",1,1);

		// login operation 
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}
}

