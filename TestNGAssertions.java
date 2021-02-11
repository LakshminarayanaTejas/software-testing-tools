package testNG;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGAssertions {
	
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		
		try {
						System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\Desktop\\Selenium testing tools\\chromedriver_win32\\chromedriver.exe");
						driver = new ChromeDriver();
						driver.manage().deleteAllCookies();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
						driver.get("https://www.gmail.com");
					}
					catch (Exception e) {
		
						e.printStackTrace();
					}
				}
  @Test
  public void testEquality() {
	  Assert.assertEquals(true, isEqual(10, 11));
	  System.out.println("Tejas lakshman");
  }
  
  public boolean isEqual(int a, int b) {
	  if (a == b) {
		  return true;
	  } else {
		  return false;
	  }
  }
  
  @Test
  public void getTitle() {
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Gmail");
	  System.out.println("Tejas");
	  
  }
  
  @AfterTest
  public void closeBrowser() {
	  driver.quit();
	  
  }
}
