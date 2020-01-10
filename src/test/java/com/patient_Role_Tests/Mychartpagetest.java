package com.patient_Role_Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.patient_Pages.Patient_Login_Page;
import com.patient_Pages.Patient_Mychart_Page;
import baseInItialization.Baseclass;

public class Mychartpagetest extends Baseclass {
	Patient_Login_Page lp;
	public Patient_Mychart_Page mychartpage;
	String pagetitle1,actualtitle;
	Mychartpagetest(){
		super();
	}
	
	@BeforeMethod
	public void iniTial() throws MalformedURLException {
		Session1();
		lp= new Patient_Login_Page(adw);
		lp.skip_Button1();
		mychartpage=lp.EmailID(prop.getProperty("Patient_Email"),prop.getProperty("Patient_Password"));
	}
	@Test(priority=1)
	public void verifyMychartpage_TitleTest() throws Exception {
		System.out.println("pagetitle");
		actualtitle="My Chart";
		Thread.sleep(5000);
		System.out.println("pagetitle2");
		pagetitle1= mychartpage.page_Title();
		System.out.println(pagetitle1);
		assertEquals(pagetitle1,actualtitle);
		System.out.println("mychart sign_in_pageTitleTest has been successfully passes");
	}
	
	@Test(priority=1)
	public void settings_Page_IconTest() {
        
		boolean flag=mychartpage.settings_Page_Icon();
		assertTrue(flag);
		System.out.println("my chart icon has been successfully displayed");
	}
		
   @AfterMethod
    public void loginTeardown()  {
		System.out.println("implicitwait");
		tearDown();
}	
   }

