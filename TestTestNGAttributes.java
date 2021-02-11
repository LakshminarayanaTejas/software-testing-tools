package testNG;

import org.testng.annotations.Test;

public class TestTestNGAttributes {
  @Test(priority=0)
  public void d() {
  }
  
  @Test(dependsOnMethods={"h"})
  public void e() {
  }
  
  @Test(priority=89)
  public void o() {
  }
  
  @Test(enabled=false)
  public void h() {
  }
  
  @Test(priority=034)
  public void f() {
  }
  
  @Test(priority=03)
  public void m() {
  }
  
  
}
