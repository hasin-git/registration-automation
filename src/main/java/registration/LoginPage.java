package registration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private static final int TIMEOUT_SECONDS = 100;
	
	public String login(WebDriver driver, String userName, String password) throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_SECONDS);
		
		//find user name and set username
		WebElement txt_username = wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		txt_username.sendKeys(userName);
		
		//find password and set password
		WebElement txt_password = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		txt_password.sendKeys(password);
       
        WebElement submitElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit")));
        submitElement.click();
 
        String nextPageTitle = driver.getTitle();
     
        return nextPageTitle;
			
	}

}
