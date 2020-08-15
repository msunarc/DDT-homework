package page;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public static void waitforElement(WebDriver driver, int timeInSeconds , By locator) {
		  WebDriverWait wait=new WebDriverWait(driver, timeInSeconds);
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public static void clickable(WebDriver driver, int timeInSeconds , By locator) {
		  WebDriverWait wait=new WebDriverWait(driver, timeInSeconds);
	  wait.until(ExpectedConditions.elementToBeClickable(locator));
	
	}
	
}