package com.patient_Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import baseInItialization.Baseclass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Patient_Mychart_Page extends Baseclass{
	
	 public Patient_Mychart_Page(AndroidDriver<MobileElement> adw) {
		
		PageFactory.initElements(new AppiumFieldDecorator(adw),this);
			
	}
	@AndroidFindBy (xpath="//*[@class='android.widget.TextView'and @bounds='[180,53][301,94]']")

	public WebElement Title;
	
	@AndroidFindBy (xpath="//*[@class='android.widget.ImageView'and @bounds='[8,51][53,96]']")
	 public WebElement icon;
	@AndroidFindBy (xpath="//*[@class='android.widget.ImageView'and @bounds='[378,726][423,771]']")
	 
	public WebElement E_consult_Button;

	public String page_Title()  {
	   
	   return Title.getText();
   }
   
   
   public boolean settings_Page_Icon() {
	   //adw.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	   return icon.isDisplayed();
   }

   public Econsult_Page econsult_Page() throws InterruptedException 
	  {
		   E_consult_Button.click();
		   
		   return new Econsult_Page(adw);
	}
	
}
