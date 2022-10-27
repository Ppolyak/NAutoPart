package nautopart.tests;

import nautopart.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void startBrowser(){
        driver = DriverSingleton.getDriver();
    }

    @AfterClass(alwaysRun = true)
    public void stopBrowser(){
        DriverSingleton.closeDriver();
    }

}
