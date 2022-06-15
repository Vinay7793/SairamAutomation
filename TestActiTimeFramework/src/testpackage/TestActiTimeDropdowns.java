package testpackage;

import java.io.IOException;


import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import generic.WebDriverCommonLib;
import pagepackage.LoginPage;
import pagepackage.SettingsPage;

public class TestActiTimeDropdowns extends BaseTest{

	@Test
	public void printAllOptionsOfTheDropdown() throws IOException, InterruptedException
	{

		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validUsername = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");
		lp.actiTimevalidLogin(validUsername, validPassword);

		SettingsPage sp = new SettingsPage(driver);
		sp.clickSettingsLink();

		WebDriverCommonLib wb = new WebDriverCommonLib();
		wb.getAllOptionsOfDropdown(sp.getTopgroupinglevelDRopDown());
		wb.getAllOptionsOfDropdown(sp.getMiddlegroupinglevelDropdown());
		wb.getAllOptionsOfDropdown(sp.getTimeentrylevelDropdown());

	}
}