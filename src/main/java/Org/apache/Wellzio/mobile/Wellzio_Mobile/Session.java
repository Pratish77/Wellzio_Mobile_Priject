package Org.apache.Wellzio.mobile.Wellzio_Mobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Session {
	
	static AndroidDriver<WebElement> adw;
	
    public static void Session1() throws MalformedURLException{
	
	DesiredCapabilities dc = new DesiredCapabilities();
	
	//dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	
	//dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	
	dc.setCapability("noReset", true);
	
	dc.setCapability("appActivity", ".MainActivity");
	
	dc.setCapability("appPackage", "com.wellzio");

	dc.setCapability(MobileCapabilityType.APP, "C:\\apkFiles\\Wellzio-RELEASE-1.2.161RELEASE.apk");
     
	URL url=new URL("http://0.0.0.0:4723/wd/hub");
	
	adw=new AndroidDriver<WebElement>(url,dc);
	
	//adw.quit();
	
}

}
