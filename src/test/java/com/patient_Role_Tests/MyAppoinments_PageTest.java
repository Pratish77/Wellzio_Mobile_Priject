package com.patient_Role_Tests;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.patient_Pages.MyAppoinments_Page;
import com.patient_Pages.Patient_Login_Page;
import com.patient_Pages.Patient_Mychart_Page;

import baseInItialization.Baseclass;

public class MyAppoinments_PageTest extends Baseclass {

	
	Patient_Login_Page lp;
	public Patient_Mychart_Page mychartpage;
	String pagetitle1,actualtitle;
	public MyAppoinments_Page mp;
	String ActualTitle;
	String ExpectedTitle;
	
	MyAppoinments_PageTest(){
		super();
	}
	
	@BeforeMethod
	public void iniTial() throws MalformedURLException, InterruptedException {
		Session1();
		lp= new Patient_Login_Page(adw);
		lp.skip_Button1();
		mychartpage=lp.EmailID(prop.getProperty("Patient_Email"),prop.getProperty("Patient_Password"));
		mp=mychartpage.appointmentsPage();
	}
	@Test(priority = 1)
	public void pageTitleTest() throws InterruptedException {
		
		 ActualTitle="My Appointments";
		 ExpectedTitle=mp.pageTitleTest();
		 System.out.println(ExpectedTitle);
	     assertEquals(ActualTitle,ExpectedTitle);	
			Thread.sleep(8000);
}
	@Test(priority = 2)
	public void appoinmentcreationTest() throws InterruptedException {
		 mp.creatingAppointment();
		 Thread.sleep(20000);
	}
	 @AfterMethod
	     public void loginTeardown()  {
			System.out.println("implicitwait");
			tearDown();
	}	
}
