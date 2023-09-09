package ua.mobile.testing.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainPage {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"open menu\"]")
    private MobileElement mainMenuButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"login screen\"]/android.widget.ScrollView/android.view.ViewGroup")
    private MobileElement aboutButton;


//    @AndroidFindBy(id = "Login button")
//    private MobileElement loginButton;

    public MainPage clickMenu() {
        mainMenuButton.click();
        return this;
    }

//    public MainPage clickLoginButton() {
//        loginButton.click();
//        return this;
//    }

    public AboutPage clickAboutButton() {
        aboutButton.click();
        return new AboutPage();
    }
}
