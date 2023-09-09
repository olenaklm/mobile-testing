package ua.mobile.testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.mobile.testing.pages.AboutPage;
import ua.mobile.testing.pages.MainPage;

public class MainMenuTest extends BaseTest {
    @Test
    public void checkNavigateToAboutPage() {
        MainPage mainPage = new MainPage();
        AboutPage aboutPage = mainPage.clickMenu()
                .clickAboutButton();
        Assert.assertEquals(aboutPage.getTextofTitleAboutPage(), "About");
    }

}
