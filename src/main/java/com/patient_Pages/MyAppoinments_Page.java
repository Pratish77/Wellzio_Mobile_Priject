package com.patient_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyAppoinments_Page {

	public MyAppoinments_Page(AndroidDriver<MobileElement> adw) {
		
		PageFactory.initElements(new AppiumFieldDecorator(adw),this);
			
	}
	@AndroidFindBy (xpath="//*[@class='android.widget.TextView'and @bounds='[122,54][358,95]']")

	public WebElement apmntpageTitle;
	
	@AndroidFindBy (xpath="//*[@class='android.view.ViewGroup'and @bounds='[160,713][320,800]']")

	public WebElement clickonapmnts;
	
	@AndroidFindBy (xpath="//*[@class='android.widget.ImageView'and @bounds='[390,635][465,710]']")

	public WebElement creatingappoinments;
	


	public String pageTitleTest() {
		clickonapmnts.click();
		return apmntpageTitle.getText();
	}
	public void creatingAppointment() {
		// TODO Auto-generated method stub
		creatingappoinments.click();
	}
}
