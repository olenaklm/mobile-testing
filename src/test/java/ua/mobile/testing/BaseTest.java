package ua.mobile.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import ua.mobile.testing.driver.DriverManager;

public class BaseTest {
    @BeforeClass
    public void createSession() {
        DriverManager.getDriver();
    }

    @AfterMethod
    public void resetApp() {
        DriverManager.getDriver().resetApp();
    }

    @AfterClass
    public void closeSession() {
        DriverManager.closeDriver();
        DriverManager.closeAppium();
        DriverManager.closeEmulator();
    }
}
