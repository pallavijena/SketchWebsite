package TestCaseImplementation

import PageObjects.PAGE_About
import PageObjects.PAGE_Home
import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import java.util.concurrent.TimeUnit

/**
 * Created by Pallavi on 10/5/2016.
 */
class VerifySketchIoInAbout {
    WebDriver driver
    @Before
    public void browserSetup()
    {
        driver=DriverCreation.getChromeDriver()
        driver.get(Constants.url)
        driver.manage().window()maximize()
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES)
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS)
        Thread.sleep(2000)
    }

    @Test
    public void verifySketchIoLink()
    {
        PAGE_Home home= new PAGE_Home(driver)
        PAGE_About about = new PAGE_About(driver)
        home.clickAbout()
        Thread.sleep(1000)
        about.clickSketchIo()
        Thread.sleep(1000)
        assert driver.findElement(By.xpath(Constants.about_sketchioText_xpath)).getText().contains("Sketch.IO creates")
        Thread.sleep(1000)
    }

    @After
    public void browserClose()
    {
        driver.close()
    }
}
