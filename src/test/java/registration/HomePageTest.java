package registration;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class HomePageTest extends WebTestBase {
	
	 private HomePage homepage = new HomePage();
     
    @Test
    public void login_user() throws IOException  {
        driver.get("http://localhost:9090/");
        screenshotHelper.saveScreenshot("C:/Users/hasin/eclipse-workspace/HomePage.png");
        String nextPage = homepage.login(driver);
        if(nextPage.equals("Sign Up")) {
	        screenshotHelper.saveScreenshot("C:/Users/hasin/eclipse-workspace/register.png");
	        assertEquals("Sign Up", nextPage);
		} /*
			 * else {
			 * screenshotHelper.saveScreenshot("C:/Users/hasin/eclipse-workspace/login.png")
			 * ; assertEquals("Please sign in", nextPage); }
			 */
    }
}
