package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestActiTimeValidLogin  extends BaseTest{


	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();


		Flib flib = new Flib();

		String username = flib.readPropertyFile(PROP_PATH, "username");
		String password = flib.readPropertyFile(PROP_PATH, "password");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		
		//close the browser
		
		bt.closeBrowser();
	}

}
