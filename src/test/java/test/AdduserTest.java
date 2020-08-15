package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.ExcelReader;
import Util.browser;
import page.Adduser;
import page.login;

public class AdduserTest {
WebDriver driver;
login loginpage;
Adduser Adduserpage;
ExcelReader xlreader = new ExcelReader("Data\\openSourcefile.xlsx");
@BeforeTest
public void launch() {
	driver=browser.Launch();
}

@DataProvider(name="get data")
public String[][] logintest(){
	String[][] data=xlreader.getAllData("Loginsheet");
	return data;
}
@Test(dataProvider ="get data" )
public void logintest(String username,String password) throws InterruptedException {
	login loginpage=PageFactory.initElements(driver, login.class);
	loginpage.Username_Element(username);
	loginpage.Password_Element(password);
	loginpage.Login_Element();
	loginpage.newuser();
	Thread.sleep(3000);
	loginpage.addnewuser();
	
}
@DataProvider(name="Details")
public String[][] readdata(){
	String[][] details= xlreader.getAllData("userDetails");
	return details;
	
}
@Test(dependsOnMethods="logintest",dataProvider="Details")
public void addcontact(String name1,String email,String name,String name2,String website) throws InterruptedException {
	Adduser addnew=PageFactory.initElements(driver, Adduser.class);
	Thread.sleep(3000);
	addnew.loginusername(name1);
	
	addnew.emailuser(email);
	
	addnew.firstname(name);
	
	addnew.lastname(name2);
	
	addnew.websitename(website);
	
	addnew.rolemodel();
	
	addnew.atlastnewuseradded();
	
}}
