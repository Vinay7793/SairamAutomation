package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1description {
	@Test (description = "This method perform login operation")
	public void login() {
		Reporter.log("login is performed",true);
	}
}
