package registration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

private static final int TIMEOUT_SECONDS = 100;

public String create_user(WebDriver driver, String email, String pwd, String fName, String lName) throws IOException {    	
	
	WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_SECONDS);
	
	WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
	emailElement.sendKeys(email);

    WebElement pwdElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
    pwdElement.sendKeys(pwd);

    WebElement fNameElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("firstName")));
    fNameElement.sendKeys(fName);

    WebElement lNameElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("lastName")));
    lNameElement.sendKeys(lName);

    WebElement submitElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
    submitElement.click();
    
    String actual_title = driver.getTitle();
    System.out.println("Actual===" + actual_title);
    return actual_title; 
  }
   
}
