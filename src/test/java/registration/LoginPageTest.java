/*
 * package registration;
 * 
 * import static org.junit.Assert.assertEquals;
 * 
 * import java.io.IOException;
 * 
 * import org.junit.Assert; import org.junit.Test; import
 * org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * public class LoginPageTest extends WebTestBase {
 * 
 * //private LoginPage loginpage = new LoginPage();
 * 
 * @Test public void login(WebDriver driver, String userName, String pwd) throws
 * IOException {
 * 
 * driver.get("http://localhost:9090/login"); String nextPage =
 * loginpage.login(driver, "Priya12@code.net", "priya123");
 * screenshotHelper.saveScreenshot("C:/Users/hasin/eclipse-workspace/login.png")
 * ; assertEquals("List Users", nextPage);
 * 
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "E:\\Softwares\\chromedriver_win32\\chromedriver.exe"); //WebDriver driver =
 * new ChromeDriver(); driver.get("http://localhost:9090/login");
 * 
 * //find user name and set username WebElement txt_username =
 * driver.findElement(By.id("username"));
 * txt_username.sendKeys("David2020@gmail.com");
 * 
 * //find password and set password WebElement txt_password =
 * driver.findElement(By.id("password"));
 * 
 * txt_password.sendKeys("david123");
 * driver.findElement(By.xpath("//button[@type='submit']")).click();
 * 
 * //another way //driver.findElement(By.name("submit")).click();
 * 
 * String expected_title = "List Users"; String actual_title =
 * driver.getTitle();
 * 
 * Assert.assertEquals(expected_title, actual_title);
 * 
 * //Click on Submit //driver.findElement(By.linkText("Register"));
 * 
 * if(expected_title.equals(actual_title)) {
 * System.out.println("Login Successful"); } else {
 * System.out.println("Login Failed"); }
 * 
 * //return actual_title; } }
 */