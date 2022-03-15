package pack123;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass12 {
		
 @BeforeClass
 public void launchbrowser()
 {
	 System.out.println("launch browser");
 }
 
 @BeforeMethod
 public void loginToApplication()
 {
	 System.out.println("loginToApplication");
 }
	
 @Test 
 public void testA()
 {
	 System.out.println("verified test A");
 }
 
 @Test  
 public void testB()
 {
	 System.out.println("verified test B");
 }
 
 @Test  (dependsOnMethods ="testB")
 public void testC()
 {
	 System.out.println("verified test C");
 }
 
 @AfterMethod
 public void logOute()
 {
	 System.out.println("logOute");
 }
 
 @AfterClass
 public void closeBrowsere()
 {
	 System.out.println("closeBrowsere");
 }	

}
