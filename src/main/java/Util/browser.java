package Util;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browser {
    static WebDriver driver;

     public static WebDriver Launch () {
    	 System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(" https://s1.demo.opensourcecms.com/wordpress/wp-login.php,");

     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	return driver;
     
     
     
     
     
     }
}
