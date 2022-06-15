package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2Enabled {
	@Test (enabled = true)
	public void login() {
		Reporter.log("login performed",true);
	}

	@Test (enabled = true)
	public void logout() {
		Reporter.log("logout performed",true);
	}

	@Test(enabled = false)
	public void signup() {
		Reporter.log("signup performed",true);
	}
}

