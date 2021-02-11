package testingforassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {
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

	driver.get("https://cegepgim.omnivox.ca/intr/");
	login();
	} catch (Exception e) {

	e.printStackTrace();
	}
	}
	public void login() {
	try {
	driver.findElement(By.id("Identifiant")).sendKeys("1995185");
	driver.findElement(By.id("Password")).sendKeys("Geethalakshman1");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(3000);
	jse =(JavascriptExecutor)driver;// Code for scrolling the page down
	jse.executeScript("scroll(0,500)");


	} catch (Exception e) {

	e.printStackTrace();
	}

	}
	public static void main(String[] args) {

	Testcase2 t1=new Testcase2();
	t1.invokeBrowser();

	}

	}


