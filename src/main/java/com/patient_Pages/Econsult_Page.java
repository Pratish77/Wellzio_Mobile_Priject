package com.patient_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseInItialization.Baseclass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Econsult_Page extends Baseclass{

	

public Econsult_Page(AndroidDriver<MobileElement> adw) {
	
	PageFactory.initElements(new AppiumFieldDecorator(adw),this);
	// TODO Auto-generated constructor stub
}

@AndroidFindBy (xpath="//*[@class='android.view.ViewGroup'and @bounds='[66,623][414,695]']")

public WebElement New_Econsult_Button;
@AndroidFindBy (xpath="//*[@class='android.widget.EditText'and @bounds='[36,374][444,446]']")
 
public WebElement Enter_econsult_Details;
@AndroidFindBy (xpath="//*[@class='android.view.ViewGroup'and @bounds='[48,698][432,770]']")
 
public WebElement Next_Button;
@AndroidFindBy (xpath="//*[@class='android.widget.EditText'and @bounds='[36,431][444,503]']")
 
public WebElement medical_com_TExt;
@AndroidFindBy (xpath="//*[@class='android.view.ViewGroup'and @bounds='[48,698][432,770]']")
 
public WebElement med_Next_Button;
@AndroidFindBy (xpath="//*[@class='android.widget.EditText'and @bounds='[36,338][444,410]']")
 
public WebElement Labs_Text;
@AndroidFindBy (xpath="//*[@class='android.view.ViewGroup'and @bounds='[48,698][432,770]']")
 
public WebElement submit_Button;
@AndroidFindBy (xpath="//*[@class='android.widget.Button'and @bounds='[226,522][322,594]']")

public WebElement ok_Button;
		
@AndroidFindBy (xpath="//*[@class='android.widget.TextView'and @bounds='[37,714][443,755]']")

public WebElement Done_Button;



 public void econsult_Create() throws InterruptedException {
	   New_Econsult_Button.click();
	   Thread.sleep(3000);
	   Enter_econsult_Details.sendKeys("Test");
	   Thread.sleep(2000);
	   Next_Button.click();
	   Thread.sleep(2000);

	   medical_com_TExt.sendKeys("Test1");
	   Thread.sleep(2000);
	   
	   // Next_Button.click();

	  // med_Next_Button.click();
	   Thread.sleep(4000);
	   
	   MobileElement listitem=(MobileElement)adw.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
	   + "new UiSelector().text(\"Next\"));"));   
	   System.out.println(listitem.getLocation());
	   
	   listitem.click();

	   Labs_Text.sendKeys("Text1111");
	   
	   Thread.sleep(2000);
	   
	   submit_Button.click();
	   
	   Thread.sleep(2000);

	   ok_Button.click();
	   
	   Thread.sleep(3000);
	   
	   Done_Button.click();
	   Thread.sleep(1000);

 }

	
}


