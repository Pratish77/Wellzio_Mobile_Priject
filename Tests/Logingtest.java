import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.pagesPackage.Login_Page;
import baseInItialization.Baseclass;

public class Logingtest extends Baseclass {
	Login_Page lp;
	
	Logingtest(){
		super();
	}
@BeforeTest
public void loginSession() throws Exception  {

	Session1();
   lp= new Login_Page(adw);
   lp.EmailID(prop.getProperty("Email"),prop.getProperty("Password"));
 //lp.verifyTitle();
}
	
@Test(priority=3)
public void loginTest() throws Exception{
	Thread.sleep(1000);
	lp.signIn();	
	//alertMethod();
	//System.out.println("implicitwait");	
}
@Test(priority=1)
public void sign_in_pageTitleTest() {
	
	String Actual="Sign in to your Wellzio account";
	String Expected= lp.verifyTitle();
	System.out.println(Expected);
	assertEquals(Actual,Expected);	
}
@Test(priority=2)
public void Sign_in_buttonTest() {
	//lp.verifySigninbutton();
	try {
		lp.verifySigninbutton();
		System.out.println("Found");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Not Found");
	}
}

@AfterTest
public void loginTeardown()  {
	System.out.println("implicitwait");
	//tearDown();
}	
}
