package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login {
	WebDriver driver;

	public login(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='user_login']")
	WebElement Username_Loactor;
	@FindBy(how = How.XPATH, using = "//input[@id='user_pass']")
	WebElement PassWord_Loactor;
	@FindBy(how = How.XPATH, using = "//input[@id='wp-submit']")
	WebElement Login_Loactor;

	@FindBy(how = How.XPATH, using = "//*[@id=\"menu-users\"]/a/div[2]")
	WebElement NEW_USER;
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu-users\"]/ul/li[3]/a")
	WebElement ADD_NEW_BUTTON;

	public void Username_Element(String username) {
		Username_Loactor.sendKeys(username);
	}
	public void Password_Element(String password) {
		PassWord_Loactor.sendKeys(password);
	}
	public void Login_Element() {
		Login_Loactor.click();
	}
	public void newuser() {
		NEW_USER.click();
	}
	public void addnewuser() {
		ADD_NEW_BUTTON.click();
	}

}
