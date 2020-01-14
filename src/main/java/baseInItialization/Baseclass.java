package baseInItialization;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.Utils.TestUtil;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass {
       protected static AndroidDriver<MobileElement> adw;
      
      
       //static WebDriver driver;
      File file;
      public Properties prop;
       
      public Baseclass() {
    	// FileInputStream file = New FileInputStream("C:\\Users\\UNIFY\\Desktop\\Wellzio_Mobile\\Config.properties");
    	
    	        file = new File("C:\\\\Users\\\\UNIFY\\\\Desktop\\\\Wellzio_Mobile\\\\Config.properties");
    		  
    			FileInputStream fileInput = null;
    			try {
    				fileInput = new FileInputStream(file);
    			} catch (FileNotFoundException e) {
    				e.printStackTrace();
    			}
    			 prop = new Properties();
    			
    			//load properties file
    			try {
    				prop.load(fileInput);
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
     
     }
    
    public static void Session1() throws MalformedURLException{
	              
    	          DesiredCapabilities dc = new DesiredCapabilities();
	
	              dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	
	              dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	              
	              dc.setCapability("noReset", true);
	
                  dc.setCapability("appActivity", ".MainActivity");
	
 	              dc.setCapability("appPackage", "com.wellzio");
 	             
 	              dc.setCapability("autoAcceptAlerts", true);
 	              
 	             dc.setCapability("unicodeKeyboard", true);
 	             
 	             dc.setCapability("resetKeyboard", true);
 	           
 	              dc.setCapability("autoDismissAlerts", true);
 	              
 	             dc.setCapability("autoGrantPermissions", true);


	              dc.setCapability(MobileCapabilityType.APP, "C:\\apkFiles\\Wellzio-RELEASE-1.2.161RELEASE.apk");
	              
                  URL url=new URL("http://0.0.0.0:4723/wd/hub");
	
	              adw=new AndroidDriver<MobileElement>(url,dc);
	              
	              adw.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	              
	            //  adw.manage().deleteAllCookies();

	              
	              
	              
	              
	}
       
       
       static public void tearDown() {
    	   adw.quit();   
       }
       
       public static void implicitwait() {
    	   
    	   adw.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       }
       public static void alertMethod() {
   		
   		Alert alert=adw.switchTo().alert();
   		alert.accept();
   	}
       public static MobileElement scroll_Method(String textname) {
      		
    	   MobileElement listitem=(MobileElement)adw.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
    			   + "new UiSelector().text(\textname));"));   
    	   return listitem;
      	}
       
      
    	
    	}

      













/*
//dc.setCapability("udid", "8LBUOZROFQ65FQOJ");

//dc.setCapability("chromedriverExecutable","Chrome");

dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

dc.setCapability("launchTimeout", "100000");

System.setProperty("Webdriver.chrome.driver", "C:\\Users\\UNIFY\\Downloads\\driver\\chromedriver.exe");




public Econsult_Page econsult_Page() throws InterruptedException 
	  {
		   E_consult_Button.click();
		   
		   return new Econsult_Page(adw);
	}
}







driver=new AndroidDriver(url,dc);

driver.get("https://wattbuy.com/");




//dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

	//dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");*/