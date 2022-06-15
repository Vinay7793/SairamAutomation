package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6DependsOnMethods {
  @Test
  public void b() {
	  Reporter.log("b",true);
  }
  
  @Test (dependsOnMethods = "b")
  public void a() {
	  Reporter.log("a",true);
  }
}
