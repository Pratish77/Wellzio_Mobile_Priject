package com.pagesPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseInItialization.Baseclass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Newappointment_Page extends Baseclass {
	
public Newappointment_Page(AndroidDriver<WebElement> adw) {
		
		PageFactory.initElements(new AppiumFieldDecorator(adw),this);
			
	}

	
	@AndroidFindBy(xpath="//*[@class='android.widget.TextView'and @bounds='[121,53][360,94]']")
	public WebElement appoinment_page;
	
   public void appMent() {
    	
    	String act="New Appointment";
   String expected =appoinment_page.getText();
             assertEquals(act, expected);
    	
    }
}