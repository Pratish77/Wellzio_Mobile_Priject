package com.patient_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseInItialization.Baseclass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Patient_Login_Page  extends Baseclass{

	
	public Patient_Login_Page(AndroidDriver<MobileElement> adw) {
		
		PageFactory.initElements(new AppiumFieldDecorator(adw),this);
			
	}
	@AndroidFindBy (xpath="//*[@class='android.widget.EditText'and @bounds='[0,137][480,227]']")
	public WebElement Email;
	
	@AndroidFindBy (xpath="//*[@class='android.widget.EditText'and @bounds='[0,235][480,325]']")
	public WebElement Passwd;
	
	@AndroidFindBy (xpath="//*[@class='android.widget.TextView'and @bounds='[203,355][278,388]']")
	public WebElement Signin;
	
	@AndroidFindBy (xpath="//*[@class='android.widget.TextView'and @bounds='[0,66][480,122]']")
	public WebElement Title;
	
	@AndroidFindBy (xpath="//*[@class='android.widget.TextView'and @bounds='[0,66][480,122]']")
	public WebElement Forget_Password;
	@AndroidFindBy (xpath="//*[@class='android.widget.TextView'and @bounds='[60,318][420,359]']")
	public WebElement app_updateSkip;
	@AndroidFindBy (xpath="//*[@class='android.widget.Button'and @bounds='[246,466][342,538]']")
	public WebElement skip_Button;
	
	public Patient_Mychart_Page EmailID(String Emailid,String Passwd1) {
		
		 Email.clear();
		 Email.sendKeys(Emailid);
		 Passwd.sendKeys(Passwd1);	 
		 Signin.click();
	  return new Patient_Mychart_Page(adw);
		
	}
	public String verifyTitle() {
		
		return Title.getText();
		
	}
    public boolean verifySigninbutton() {
		
		return  Signin.isDisplayed();
    }
    public String  skip_Update()
    {
    	     
      return app_updateSkip.getText();
    	
    }
    public void skipB()
    {
            skip_Button.click();
    
    }
    
    public void frameB()
    {
           adw.switchTo().frame(0);
    
    }
	
	
	/*public Patient_Mychart_Page signIn() {
		
		Signin.click();
		
		return new Patient_Mychart_Page(adw);
	}*/
	
	public void verifyForget_Password() {
		
		Forget_Password.click();
		
	}
	public void skip_Button1() {
  	  
  	  skip_Button.click();

  }
}