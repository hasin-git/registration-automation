package registration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private static final String REGISTER_PATH = "//a[@href='/register']";
    private static final String LOGIN_PATH = "//a[@href='/login']";
 
    private static final int TIMEOUT_SECONDS = 50;
 
    public String login(WebDriver driver) throws IOException {    	
    	
    	WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_SECONDS);
    	
    	WebElement registerElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(REGISTER_PATH)));
    	registerElement.click();
    	
    	//String expected_title = "Sign Up";
		String actual_title = driver.getTitle();
  
	    WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LOGIN_PATH)));
	    loginElement.click();
         
       return actual_title;    	
    }
}
