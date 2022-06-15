package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getpagesource {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/My%20pc/OneDrive/Desktop/Html/Text%20box.html");
		String SourceCodeOfTheWebpage = driver.getPageSource();
		
		System.out.println(SourceCodeOfTheWebpage);
		
	}

}
