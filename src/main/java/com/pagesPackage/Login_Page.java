 package com.pagesPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseInItialization.Baseclass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login_Page extends Baseclass {

	
	public Login_Page(AndroidDriver<MobileElement> adw) {
		
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
	
	public void EmailID(String Emailid,String Passwd1) {
		
		 Email.clear();
		 Email.sendKeys(Emailid);
		 Passwd.sendKeys(Passwd1);	 
	}
	public String verifyTitle() {
		
		return Title.getText();
		
	}
    public boolean verifySigninbutton() {
		
		return  Signin.isDisplayed();
    }
	
	
	public Newappointment_Page signIn() {
		
		Signin.click();
		
		return new Newappointment_Page(null);
	}
	
	public void verifyForget_PAssword() {
		
		Forget_Password.click();
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*@Test
	public void logIn() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Email=adw.findElement(By.xpath("//*[@class='android.widget.EditText'and @bounds='[0,137][480,227]']"));
		WebElement Passw1=adw.findElement(By.xpath("//*[@class='android.widget.EditText'and @bounds='[0,235][480,325]']"));
		WebElement Signin=adw.findElement(By.xpath("//*[@class='android.widget.TextView'and @bounds='[203,355][278,388]']"));
		Email.clear();
		Email.sendKeys("wzd11@wellzio.com");
		Thread.sleep(3000);
		Passw1.sendKeys("Wz12345!");
		Thread.sleep(3000);
		Signin.click();
		Thread.sleep(3000);
		//System.out.println(adw.getTitle());	
		adw.quit();
	}
	}*/

	
	































/*String E=Email.getText();

System.out.println(E);
		//findElementByXPath("//android.widget.FrameLayout[0]/android.widget.EditText[1]");

WebElement Emailid=adw.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]");

Emailid.sendKeys("wzd11@gmail.com");

WebElement Passwd=adw.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]");

Passwd.sendKeys("Wz123456!");

WebElement Signin=adw.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");

Signin.click();*/
