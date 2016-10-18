package TestCaseImplementation

import PageObjects.PAGE_Home;
import Setup.Constants;
import Setup.DriverCreation
import org.junit.After
import org.junit.Assert;
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DriverCommand;

/**
 * Created by Pallavi on 10/3/2016.
 * This test case is to verify if user is successfully able to navigate to sketchpad page and come back to home screen
 */
public class VerifySketchpadPage extends PAGE_Home{
    WebDriver driver
    @Before
    public void browserSetup()
    {
        driver= DriverCreation.getChromeDriver()
        driver.get(Constants.url)
        driver.manage().window().maximize()
        Thread.sleep(3000)
    }

    @Test
    public void verifySketchpadScreen()
    {
        PAGE_Home homepage= new PAGE_Home(driver)
        homepage.gotoSketchpad()
        Thread.sleep(6000)
        String penname = driver.findElement(By.xpath(Constants.sketchpad_pen_xpath)).getText()
        print(penname)
        assert penname.equals("PEN")
        driver.navigate().back()
        Thread.sleep(3000)
    }

    @After
    public void browserClose()
    {
        driver.close()
    }
}
