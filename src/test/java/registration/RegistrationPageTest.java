package registration;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class RegistrationPageTest extends WebTestBase {
	
	 private RegisterPage registerpage = new RegisterPage();
    
   @Test
   public void create_user() throws IOException  {
       driver.get("http://localhost:9090/register");       
       String nextPage = registerpage.create_user(driver, "Priya12@code.net", "priya123", "Priya", "Anne");
       screenshotHelper.saveScreenshot("C:/Users/hasin/eclipse-workspace/register.png");
       assertEquals("", nextPage);       
   }

}
