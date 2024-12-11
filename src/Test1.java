import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Test1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver;
		
		
        AppiumDriverLocalService service;
        
        service = new AppiumServiceBuilder().withAppiumJS(new File("src")).
        		withIPAddress("127.0.0.1").usingPort(4723).build();
        
        service.start();
		
		DesiredCapabilities cap = new DesiredCapabilities();
		//DesiredCapabilities cap= new DesiredCapabilities();
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "My_Avd");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"), cap);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]").click();
		driver.findElementByCssSelector(".android.widget.CheckBox").click();
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		driver.findElementByCssSelector(".android.widget.EditText").sendKeys("My Wifi");
		Thread.sleep(20000);
		
	
		
		
	}

}
