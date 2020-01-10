package com.patient_Role_Tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.patient_Pages.Econsult_Page;
import com.patient_Pages.Patient_Login_Page;
import com.patient_Pages.Patient_Mychart_Page;

import baseInItialization.Baseclass;

public class Econsult_Page_Test extends Baseclass{
	
	Patient_Login_Page lp;
	public Patient_Mychart_Page mychartpage;
	String pagetitle1,actualtitle;
	
	Econsult_Page Econsultpage ;
	Econsult_Page_Test(){
		super();
	}
	
	@BeforeMethod
	public void iniTial() throws MalformedURLException, InterruptedException {
		Session1();
		lp= new Patient_Login_Page(adw);
		lp.skip_Button1();
		mychartpage=lp.EmailID(prop.getProperty("Patient_Email"),prop.getProperty("Patient_Password"));
		Econsultpage=mychartpage.econsult_Page();
		
		//Patient_Mychart_Page mychartpage = new Patient_Mychart_Page(null);
	}
	
	@Test(priority=1)
	public void E_consult() throws InterruptedException{
		
		for(int i=0;i<=1;i++) {
		Econsultpage.econsult_Create();
		Thread.sleep(5000);
		}
		
		
	}
	@AfterMethod
	public void loginTeardown()  {
		System.out.println("implicitwait");
		tearDown();
	}
	}


