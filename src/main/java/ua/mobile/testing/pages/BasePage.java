package ua.mobile.testing.pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import ua.mobile.testing.driver.DriverManager;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }
}
