package pageobjectmodel;

import java.io.IOException;

public class ActiTimeInValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt=new BaseTest();
		bt.setUp(); // open the b rowser and launch the web app
		Flib flib = new Flib();
		LoginPage lp =new LoginPage(driver);

		//get the row count to itterate the for loop

		int rc = flib.getRowCount(EXCEL_PATH,"invalidcred");

		for (int i=1;i<=rc;i++)
		{

			String invalidUsername = flib.readExcelData(EXCEL_PATH,"invalidcred", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH,"invalidcred", i, 1);
			//perform login
			lp.actiTimeinvalidLogin(invalidUsername, invalidPassword);
		}
		//close the browser
		bt.tearDown();
	}
}
