package ua.mobile.testing.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AboutPage {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView")
    private MobileElement titleAboutPage;

    public String getTextofTitleAboutPage() {
        return titleAboutPage.getText();
    }

}
