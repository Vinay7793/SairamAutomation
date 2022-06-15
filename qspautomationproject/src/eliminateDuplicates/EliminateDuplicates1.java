package eliminateDuplicates;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/My%20pc/OneDrive/Desktop/Html/Multiple%20select%20dropdown.html");
		
		WebElement dropdownelement = driver.findElement(By.id("menu"));
		Select sel=new Select(dropdownelement);
		
		//get the list of WebElements
		
		List<WebElement> options = sel.getOptions();
		
		//decalre a set to eliminate the duplicate data
		
		HashSet<String> s= new HashSet<String>();
		
		//read the list and get the text
		
		for (int i=0;i<options.size();i++)
		{
			WebElement ops = options.get(i);
			String text = ops.getText();
			//add the text to set so that duplicates won't be accepted and
			//order of insertion won't be maintained
			s.add(text);
		}
		//read the set
		for (String se:s)
		{
			System.out.println(se);
		}

	}

}
