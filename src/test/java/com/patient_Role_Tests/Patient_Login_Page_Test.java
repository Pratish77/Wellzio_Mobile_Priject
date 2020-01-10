package com.patient_Role_Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.patient_Pages.Patient_Login_Page;

import baseInItialization.Baseclass;

public class Patient_Login_Page_Test extends Baseclass {
	Patient_Login_Page lp;
//String pagetitle,actualtitle;
	
	//Patient_Mychart_Page mychartpage;
	
	Patient_Login_Page_Test(){
		super();
	}
@BeforeMethod
public void loginSession() throws Exception  {
	Session1();
   lp= new Patient_Login_Page(adw);
   lp.skip_Button1();
}
@Test(priority=1)
public void sign_in_pageTitleTest() {
	
	String Actual="Sign in to your Wellzio account";
	String Expected= lp.verifyTitle();
	System.out.println(Expected);
	assertEquals(Actual,Expected);	
	System.out.println("sign_in_pageTitleTest has been successfully passes");
}
@Test(priority=2)
public void Sign_in_buttonTest() {
	
	try {
		lp.verifySigninbutton();
		System.out.println("Found");
		System.out.println("Sign_in_buttonTest has been passed");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Not Found");
	}
}
@AfterMethod
public void loginTeardown()  {
	System.out.println("implicitwait");
	tearDown();
}
}
/*@Test(priority=1)
public void loginTest() throws Exception{
	Thread.sleep(1000);
	lp.frameB();
	String text=lp.skip_Update();
	
	if (text.contains("Wellzio update")){
		
		lp.skipB();
		mychartpage=lp.EmailID(prop.getProperty("Patient_Email"),prop.getProperty("Patient_Password"));
		
	}else {
		mychartpage=lp.EmailID(prop.getProperty("Patient_Email"),prop.getProperty("Patient_Password"));	
	}
	
}*/