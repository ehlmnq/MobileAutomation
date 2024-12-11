import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test2 {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		//DesiredCapabilities cap= new DesiredCapabilities();
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "My_Avd");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size());
		
	/*	
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementByCssSelector(".android.widget.CheckBox").click();
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		driver.findElementByCssSelector(".android.widget.EditText").sendKeys("My Wifi");
		driver.findElementByXPath("//*[@text='OK']").click();
		*/
	}

}
