package test;

import org.testng.annotations.Test;

import pageobject.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass {
	LoginPage login;
  @Test
  public void login() {
	  login = new LoginPage(driver);
	  login.loginDetails();
	  
  }
  
}
