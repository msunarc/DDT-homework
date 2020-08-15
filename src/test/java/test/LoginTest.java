package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.ExcelReader;
import Util.browser;
import page.login;

public class LoginTest {
	 WebDriver driver;
	ExcelReader xl= new ExcelReader("Data\\openSourcefile.xlsx");
	
	@BeforeTest
	public  void Launch() {
		driver=browser.Launch();
	}
	@DataProvider(name="Get Data")
	public String[][] readloginSheet() {
		String[][] data=xl.getAllData("Loginsheet");
		return data;
	}
	@Test(dataProvider ="Get Data" )
	public void longintest (String username,String password) {

		login loginPage= PageFactory.initElements(driver,login.class);
		loginPage.Username_Element(username);

		loginPage.Password_Element(password);

		loginPage.Login_Element();
		loginPage.newuser();
		loginPage.addnewuser();

	
	}

}
