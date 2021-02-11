package testingforassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	WebDriver driver;
	JavascriptExecutor jse;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\Desktop\\Selenium testing tools\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("https://www.amazon.ca/");
			search();
		}
		catch (Exception e) {

			e.printStackTrace();
		}
	}
		public void search() {
			try {
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
				Thread.sleep(3000);

				jse =(JavascriptExecutor)driver;// Code for scrolling the page down
				jse.executeScript("scroll(0,500)");

		} 
			catch (Exception e) {

				e.printStackTrace();
		}

		}
		public static void main(String[] args) {

			Testcase1 t1=new Testcase1();
			t1.invokeBrowser();

		}

		}

	
