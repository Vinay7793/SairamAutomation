package pageobjectmodel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt =new BaseTest();
		bt.setUp();//open the browser and launch the web app
		Flib flib = new Flib();

		//read the data from excel file by using generic reusable methods
		String validUsername = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");

		LoginPage lp = new LoginPage(driver);
		//perform login
		lp.actiTimevalidLogin(validUsername, validPassword);
		//close the browsers
		bt.tearDown();
	}
}