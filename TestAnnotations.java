package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	
  @Test
  public void f1() {
	  System.out.println("Inside F1");
	  
  }
  
  @Test
  public void f2() {
	  System.out.println("Inside F2");
	  
  }
  
  @BeforeTest
  public void beforeAnyTest() {
	  System.out.println("Before all the tests ");
  }
  
  @AfterTest
  public void afterAllTheTest() {
	  System.out.println("After all the tests");
	  
	  
  }
  
  @BeforeMethod
  public void beforeEveryMethod() {
	  System.out.println("Before every test method");
	  
  }
  
  @AfterMethod
  public void afterEveryMethod() {
	  System.out.println("After every test method");
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
	  
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
	  
	  
  }
}
