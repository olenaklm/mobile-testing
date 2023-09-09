package ua.mobile.testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import static java.lang.Thread.sleep;

public class NewTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException{
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("deviceName","Pixel_2_API_26");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appium:automationName","UiAutomator2");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("app","src/main/resources/app.apk");
        capabilities.setCapability("appPackage", "com.saucelabs.mydemoapp.rn");
        // This package name of your app (you can get it from apk info app)
        capabilities.setCapability("appActivity","com.saucelabs.mydemoapp.rn.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)
        // Create RemoteWebDriver instance and connect to the Appium server
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723"), capabilities);
    }

    @Test
    public void Test() throws InterruptedException {

//        WebElement menu=driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]"));
//        sleep(5000);
//        menu.click();

        WebElement product1 = driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"store item text\"])[1]"));
        sleep(5000);
        Assert.assertEquals(product1.getText(), "Sauce Labs Backpack");
    }


    @AfterClass
    public void teardown(){
        //close the app
        driver.quit();
    }

}
